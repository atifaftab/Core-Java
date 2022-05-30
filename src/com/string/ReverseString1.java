package com.string;

import java.util.Scanner;

public class ReverseString1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter th");

        String source = "Atif";
        String reverse = "";

        for (int i = source.length() - 1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }
        System.out.println(reverse);
    }
}
