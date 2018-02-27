package test.fibonacci;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FibonacciTest {

    @Test
    public void zero() {
        assertEquals(0, fibonacci(0));
    }

    @Test
    public void one() {
        assertEquals(1, fibonacci(1));
    }

    @Test
    public void two() {
        assertEquals(1, fibonacci(2));
    }

    @Test
    public void three() {
        assertEquals(2, fibonacci(3));
    }

    @Test
    public void four() {
        assertEquals(3, fibonacci(4));
    }

    private int fibonacci(int i) {

        if (i <= 1) {
            return i;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }
}
