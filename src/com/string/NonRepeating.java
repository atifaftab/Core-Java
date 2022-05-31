package com.string;

import java.util.HashMap;
import java.util.Map;

public class NonRepeating {
    public static void main(String[] args) {
        String str = "abcdeabc";
        char[] charArray = str.toCharArray();
        Map<Character,Integer> map = new HashMap();
        for(char c : charArray){
            Integer i = map.get(c);
            if(i==null)
                map.put(c,1);
            else
                map.put(c,map.get(c)+1);
        }
        System.out.println(map);
    }
}
