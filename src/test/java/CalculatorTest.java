import static org.junit.Assert.*;

import org.example.Calculator;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSquareRoot() {
        double result = Calculator.squareRoot(25);
        System.out.println("Test Square Root: Expected = 5.0, Actual = " + result);
        assertEquals(5.0, result, 0.001);
    }

    @Test
    public void testFactorial() {
        long result = Calculator.factorial(5);
        System.out.println("Test Factorial: Expected = 120, Actual = " + result);
        assertEquals(120, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        System.out.println("Test Factorial Negative: Expecting IllegalArgumentException");
        Calculator.factorial(-5);
    }

    @Test
    public void testNaturalLog() {
        double result = Calculator.naturalLog(1);
        System.out.println("Test Natural Log: Expected = 0.0, Actual = " + result);
        assertEquals(0.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNaturalLogNegative() {
        System.out.println("Test Natural Log Negative: Expecting IllegalArgumentException");
        Calculator.naturalLog(-1);
    }

    @Test
    public void testPower() {
        double result = Calculator.power(2, 3);
        System.out.println("Test Power: Expected = 8.0, Actual = " + result);
        assertEquals(8.0, result, 0.001);
    }
}
