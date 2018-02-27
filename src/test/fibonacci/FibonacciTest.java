package test.fibonacci;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FibonacciTest {

    @Test
    public void one() {
        assertEquals(1, fibonacci(1));
    }

    private int fibonacci(int i) {
        return 1;
    }
}
