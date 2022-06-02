package test;

import java.util.HashMap;

import static java.util.List.of;

public class Test {
    /*

     * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 ?
     *
     * Sample Results
     * s1 = "waterbottle" , s2="erbottlewat" --> return true
     * */
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(isRotation(s1, s2));
    }

    public static boolean isRotation(String s1, String s2) {
        // TODO your code goes here
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s1.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();

       if(charArray1.length == charArray1.length){
           for(char c: charArray2){
               if(c == ' ' )
               {
               }
           }
       }
        else
            return false;
        return false;
    }

}


//algorithim with datasturucture with string manipulation and dynamic

//take pratical example with the question
//system designning
// how internally java works and it functionality, like map and hashmap

// for any answer take theoritical then show practical

