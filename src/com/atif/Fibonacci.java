package com.atif;

public class Fibonacci {

    public static void main(String args[]){
        int n1= 1, n2=2, n3=3,i, count = 10;

        for(i=2; i<count;i++){
            n3 = n1 + n2;
            System.out.println(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
