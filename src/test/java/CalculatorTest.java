
import static org.junit.Assert.*;

import org.example.Calculator;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testSquareRoot()     {
        assertEquals(5.0, Calculator.squareRoot(25), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Calculator.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Calculator.factorial(-5);
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0.0, Calculator.naturalLog(1), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNaturalLogNegative() {
        Calculator.naturalLog(-1);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Calculator.power(2, 3), 0.001);
    }
}
