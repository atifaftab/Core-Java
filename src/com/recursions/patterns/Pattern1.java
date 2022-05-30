package com.recursions.patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 4;
        pattern(n, 1);
    }

    static void pattern(int n, int i) {
        if (n == 0)
            return;
        print(i);
        System.out.println();
        pattern(n - 1, i + 1);
    }

    static void print(int n) {
        if (n == 0)
            return;
        System.out.print("* ");
        print(n - 1);
    }
}
