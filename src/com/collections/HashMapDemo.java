package com.collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

    public static void main(String args[]){

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,"Atif");
        map.put(2,"someone");

        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
