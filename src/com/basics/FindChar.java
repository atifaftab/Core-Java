package com.basics;

public class FindChar {
    public static void main(String[] args) {
        int n = 1;
        char j = 'j';
        String text = "Stranger";
        char letter = '\0';
        do {
            letter = text.charAt(n);
            System.out.println(letter);
            if (letter > 'j')
                n += 3;
            else
                n -= 1;
        }
        while (n <= 5);

    }
}
