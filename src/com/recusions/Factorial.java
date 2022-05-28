package com.recusions;

public class Factorial {

    public static void main(String[] args) {

        int fact = factorial(0);
        System.out.println(fact);
    }

    static int factorial(int n) {
        if (n <= 1)
            return 1;
        else {
            return n * factorial(n - 1);
        }
    }
}
