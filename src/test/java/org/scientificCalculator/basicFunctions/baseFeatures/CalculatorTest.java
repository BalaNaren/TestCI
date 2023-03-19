package src.test.org.scientificCalculator.basicFunctions.baseFeatures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {    

    private Calculator calculator;    

    @Before
    public void setUp() {
        calculator = new Calculator();
    }    

    @Test
    public void testAddDouble() {
        double result = calculator.add(2.5, 3.5);
        assertEquals(6.0, result, 0.001);
    }    

    @Test
    public void testSubtractDouble() {
        double result = calculator.subtract(5.0, 3.5);
        assertEquals(1.5, result, 0.001);
    }    

    @Test
    public void testMultiplyDouble() {
        double result = calculator.multiply(2.5, 3.0);
        assertEquals(7.5, result, 0.001);
    }    

    @Test
    public void testDivideDouble() {
        double result = calculator.divide(6.0, 3.0);
        assertEquals(2.0, result, 0.001);
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6.0, 0.0));
    }    

    @Test
    public void testFactorial() {
        int result = calculator.factorial(5);
        assertEquals(120, result);
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-5));
    }

    

    @Test
    public void testPower() {
        double result = calculator.power(2.0, 3.0);
        assertEquals(8.0, result, 0.001);
    }    

    @Test
    public void testPowerWithNegativeExponent() {
        double result = calculator.power(2.0, -1.0);
        assertEquals(0.5, result, 0.001);
    }

}

