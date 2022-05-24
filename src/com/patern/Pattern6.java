package com.patern;

/*
print

      *
    * *
  * * *
* * * *
  * * *
    * *
      *

* */




import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for stars ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = n - 1; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}
