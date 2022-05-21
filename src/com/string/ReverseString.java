package com.string;

public class ReverseString {

    public static void main(String[] args){
        String str = "Atif";

        System.out.println("hi");
        String reverse = "";

        for(int i = str.length() - 1; i>=0; i--){
            reverse = reverse + str.substring(i, i+1);
        }

        System.out.println(reverse);
    }
}
