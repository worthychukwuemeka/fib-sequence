package main;

import test.java.FibSequence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FibSequence fib = new FibSequence();
        int n = 10;
        List<Integer> sequence = fib.generate(n);

        for (int i = 0; i < n; i++) {
            System.out.println(sequence.get(i));
        }
    }
}