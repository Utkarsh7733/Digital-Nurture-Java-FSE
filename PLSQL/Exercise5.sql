CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE ON Customers
FOR EACH ROW
BEGIN
    :NEW.LastModified := SYSDATE;
END;
/

CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog
    (TransactionID, AccountID, Amount, TransactionDate)
    VALUES
    (:NEW.TransactionID,
     :NEW.AccountID,
     :NEW.Amount,
     SYSDATE);
END;
/

CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
    v_Balance NUMBER;
BEGIN
    IF :NEW.Amount <= 0 THEN
        RAISE_APPLICATION_ERROR(-20001,'Amount must be positive');
    END IF;

    IF :NEW.TransactionType = 'Withdrawal' THEN
        SELECT Balance
        INTO v_Balance
        FROM Accounts
        WHERE AccountID = :NEW.AccountID;

        IF v_Balance < :NEW.Amount THEN
            RAISE_APPLICATION_ERROR(-20002,'Insufficient Balance');
        END IF;
    END IF;
END;
/