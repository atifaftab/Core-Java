package com.patern;


/*
print

*
**
***
****
***
**
*

* */


import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for stars ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        for (int i = 1; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}
