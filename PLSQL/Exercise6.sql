DECLARE
    CURSOR GenerateMonthlyStatements IS
    SELECT CustomerID, Amount
    FROM Transactions
    WHERE EXTRACT(MONTH FROM TransactionDate) = EXTRACT(MONTH FROM SYSDATE)
      AND EXTRACT(YEAR FROM TransactionDate) = EXTRACT(YEAR FROM SYSDATE);

BEGIN
    FOR rec IN GenerateMonthlyStatements LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Customer ID: ' || rec.CustomerID ||
            ' Amount: ' || rec.Amount
        );
    END LOOP;
END;
/

DECLARE
    CURSOR ApplyAnnualFee IS
    SELECT AccountID
    FROM Accounts;

BEGIN
    FOR rec IN ApplyAnnualFee LOOP
        UPDATE Accounts
        SET Balance = Balance - 100
        WHERE AccountID = rec.AccountID;
    END LOOP;

    COMMIT;
END;
/

DECLARE
    CURSOR UpdateLoanInterestRates IS
    SELECT LoanID
    FROM Loans;

BEGIN
    FOR rec IN UpdateLoanInterestRates LOOP
        UPDATE Loans
        SET InterestRate = InterestRate + 0.5
        WHERE LoanID = rec.LoanID;
    END LOOP;

    COMMIT;
END;
/