import org.junit.Test;
import static org.junit.Assert.*;

import  org.spe.Main;

public class CalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, Main.squareRoot(4), 0.0001);
        assertEquals(3.0, Main.squareRoot(9), 0.0001);
        assertEquals(4.0, Main.squareRoot(16), 0.0001);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, Main.factorial(0));
        assertEquals(1, Main.factorial(1));
        assertEquals(120, Main.factorial(5));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(0.0, Main.naturalLogarithm(1), 0.0001);
        assertEquals(1.6094, Main.naturalLogarithm(5), 0.0001);
        assertEquals(2.3025, Main.naturalLogarithm(10), 0.0001);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Main.power(2, 3), 0.0001);
        assertEquals(27.0, Main.power(3, 3), 0.0001);
        assertEquals(10000.0, Main.power(10, 4), 0.0001);
    }
}
