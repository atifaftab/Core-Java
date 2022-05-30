package com.exceptions;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = in.nextInt();
        try {
            validInput(n);
        }
        catch (InvalidInputException e){
//            System.err.print("CAUGHT EXCEPTION ");
//            System.out.println(ConsoleColors.red + "CAUGHT EXCEPTION " + ANSI_RESET);
            System.out.println(" -- The Input number is more than 100");
        }
    }
    static void validInput(int num) throws InvalidInputException{
        if(num>100){
            throw new InvalidInputException("Exception");
        }
        System.out.println("Valid Input number");
    }
}
class InvalidInputException extends Exception{
    InvalidInputException(String str){
        super(str);
    }
}