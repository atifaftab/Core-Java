package com.patern;


/*
print

****
***
**
*

* */


import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number for stars ");
        int n = in.nextInt();

       /* for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }


        in.close();
    }
}
