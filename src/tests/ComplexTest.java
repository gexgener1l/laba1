package tests;

import demo.parallel.Complex;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplexTest {

    @Test
    public void testDividedBy() {
        Complex c1 = new Complex(4, 2);
        Complex c2 = new Complex(1, 3);
        Complex result = c1.dividedBy(c2);
        assertEquals("Division result is incorrect.", new Complex(1.4, -0.2), result);
    }

    @Test
    public void testSqrt() {
        Complex c1 = new Complex(4, 0);
        Complex result = c1.sqrt();
        assertEquals("Square root result is incorrect.", new Complex(2, 0), result);

        Complex c2 = new Complex(0, 4);
        result = c2.sqrt();
        assertComplexEquals(new Complex(1.4142, 1.4142), result, 0.0001, "Square root result is incorrect.");
    }

    private void assertComplexEquals(Complex expected, Complex actual, double delta, String message) {
        assertEquals(message + " (real part)", expected.getReal(), actual.getReal(), delta);
        assertEquals(message + " (imaginary part)", expected.getImaginary(), actual.getImaginary(), delta);
    }
}
