package test.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.ArrayList;

public class FibSequence {
    public List<Integer> generate(int n) {
        List<Integer> sequence = new ArrayList<>();
        if (n >= 1) {
            sequence.add(0);
        }
        if (n >= 2) {
            sequence.add(1);
        }

        for (int i = 2; i < n; i++) {
            int next = sequence.get(i - 1) + sequence.get(i - 2);
            sequence.add(next);
        }

        return sequence;
    }

    @Test
    public void testGenerateFibonacciSequence() {
        FibSequence fib = new FibSequence();

        // Test the generation of the Fibonacci sequence with a limit of 10
        List<Integer> sequence = fib.generate(10);

        // Check the size of the generated sequence
        assertEquals(10, sequence.size());

        // Check the correctness of the first few numbers in the sequence
        assertEquals(0, (int) sequence.get(0));
        assertEquals(1, (int) sequence.get(1));
        assertEquals(1, (int) sequence.get(2));
        assertEquals(2, (int) sequence.get(3));
        assertEquals(3, (int) sequence.get(4));
        assertEquals(5, (int) sequence.get(5));
        assertEquals(8, (int) sequence.get(6));
        assertEquals(13, (int) sequence.get(7));
        assertEquals(21, (int) sequence.get(8));
        assertEquals(34, (int) sequence.get(9));
    }
}
