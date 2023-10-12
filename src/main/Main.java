package main;

import test.java.Fib;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fib fib = new Fib();
        int n = 10;
        List<Integer> sequence = fib.generate(n);

        for (int i = 0; i < n; i++) {
            System.out.println(sequence.get(i));
        }
    }
}