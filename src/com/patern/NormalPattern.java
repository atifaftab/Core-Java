package com.patern;

/*
print

****
****
****
****

* */

import java.util.Scanner;

public class NormalPattern {
    public static void main(String argd[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number for stars ");
        int n = in.nextInt();

        for(int i = 0; i<n;i++){
            for(int j = 0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
    }
}
