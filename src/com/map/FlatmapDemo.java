package com.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatmapDemo {
    public static void main(String[] args) {
        Map<String, Map> map = new HashMap<>();

        Map<String, String> map1 = new HashMap<>() {
            {
                put("key1", "1");
                put("key2", "2");
            }
        };
        Map<String, String> map2 = new HashMap<>() {
            {
                put("key3", "3");
                put("key4", "4");
            }
        };
        Map<String, String> map3 = new HashMap<>() {
            {
                put("key5", "5");
                put("key6", "6");
            }
        };
        Map<String, String> map4 = new HashMap<>() {
            {
                put("key7", "7");
                put("key8", "8");
            }
        };
        Map<String, String> map5 = new HashMap<>() {
            {
                put("key19", "9");
                put("key10", "10");
            }
        };
        map.put("map1", map1);
        map.put("map2", map2);
        map.put("map3", map3);
        map.put("map4", map4);
        map.put("map5", map5);

        System.out.println("Outer map");
        System.out.println(map + "\n");

        List<String> outerKey = map.keySet().stream().collect(Collectors.toList());
        System.out.println(" Outer Keys");
        System.out.println(outerKey+ "\n");

        List<Map> innerMap = map.values().stream().collect(Collectors.toList());
        System.out.println(" Inner map");
        System.out.println(innerMap+ "\n");

        List<Set> innerKeys = map.values().stream().map(i -> i.keySet()).collect(Collectors.toList());
        System.out.println(" Inner keys");
        System.out.println(innerKeys+ "\n");

        Object innerKeyFlatMap = map.values().stream().flatMap(i -> i.keySet().stream()).collect(Collectors.toList());
//        Object innerKeyFlatMap = map.values().stream().flatMap(i -> i.keySet().stream().filter(j -> "key5".equals(j.toString()))).collect(Collectors.toList());
        System.out.println(" Inner keys flatMap");
        System.out.println(innerKeyFlatMap+ "\n");
//
//        map.values().stream().flatMap(i ->i)



    }
}
