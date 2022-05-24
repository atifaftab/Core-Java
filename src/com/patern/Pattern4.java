package com.patern;
/*
print

* * * *
  * * *
    * *
      *

* */
import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number of row : ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
