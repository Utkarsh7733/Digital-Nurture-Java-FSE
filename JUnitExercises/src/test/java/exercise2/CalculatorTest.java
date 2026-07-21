package exercise2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator=new Calculator();

    @Test
    public void testAddition(){

        assertEquals(8,calculator.add(5,3));

    }

    @Test
    public void testMultiplication(){

        assertEquals(15,calculator.multiply(3,5));

    }

}