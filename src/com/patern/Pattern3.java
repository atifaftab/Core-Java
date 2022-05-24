package com.patern;



/*
print

      *
    * *
  * * *
* * * *

* */


import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of stars ");
        int n = in.nextInt();


       /* int rows = 4;
        for (int j = 1; j <= rows; j++) {
            for (int i = 1; i <= rows - j; i++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }*/


       /* for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        in.close();
    }
}
