package com.map;

import java.util.*;
import java.util.stream.Collectors;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {
//p1();
        p3();
//        p2();
//Stream<List<String>>>

    }

    static void p1() {
        Map<String, List<String>> map = new HashMap<>();

        map.put("test", Arrays.asList("1", "2", "3", "4"));
        map.put("test2", Arrays.asList("10", "20", "30", "40"));
        map.put("test3", Arrays.asList("100", "200", "300", "400"));

        int maxcounter = 1000000;
        List<String> someList = new ArrayList<>();
        System.out.println("1 stream flatmap");
        List<List<String>> collect = null;
        for (int i = 0; i < maxcounter; i++) {
            someList = map.values().stream().flatMap(c -> c.stream()).collect(Collectors.toList());
            collect = map.values().stream().collect(Collectors.toList());
        }
        Collection<List<String>> values = map.values();
        System.out.println(collect);
        for (int i = 0; i < maxcounter; i++) {
            //collect = map.values();
            values = map.values();
        }
//        System.out.println(values);
//        System.out.println(someList);
    }

    static void p3() {
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

        //List<Integer> li = map.values().stream().map(c -> c).collect(Collectors.toList());
        Collection<Map> values = map.values();
        Object vals = map.values().stream().flatMap(c -> c.values().stream()).collect(Collectors.toList());
        Object keys = map.values().stream().flatMap(c -> c.keySet().stream()).collect(Collectors.toList());
        Object oKeys = map.keySet().stream().collect(Collectors.toList());
        System.out.println(values);
        System.out.println(vals);
        System.out.println(keys);
        System.out.println(oKeys);
    }

    static void p2() {
        Map<String, Integer> map = new HashMap<>();

        map.put("test", 1);
        map.put("test2", 2);
        map.put("test3", 3);
        map.put("test4", 4);
        map.put("test5", 5);
        map.put("test6", 6);
        List<Integer> li = map.values().stream().map(c -> c).collect(Collectors.toList());
        System.out.println(li);
    }
//
//    System.out.println("1 parallel stream flatmap");
//    millis = System.currentTimeMillis();
//    for (int i = 0; i < maxcounter; i++) {
//        List<String> someList = map.values().parallelStream().flatMap(c -> c.stream()).collect(Collectors.toList());
//    }
//    System.out.println(System.currentTimeMillis() - millis);
//
//    System.out.println("1 foreach");
//    millis = System.currentTimeMillis();
//    for (int i = 0; i < maxcounter; i++) {
//        List<String> mylist = new ArrayList<String>();
//        map.values().forEach(mylist::addAll);
//    }
//    System.out.println(System.currentTimeMillis() - millis);
//
//    System.out.println("1 for");
//    millis = System.currentTimeMillis();
//    for (int i = 0; i < maxcounter; i++) {
//        List<String> mylist = new ArrayList<String>();
//        for (List<String> item : map.values()) {
//            mylist.addAll(item);
//        }
//    }
//    System.out.println(System.currentTimeMillis() - millis);
//
//
//    System.out.println("2 stream flatmap");
//    millis = System.currentTimeMillis();
//    for (int i = 0; i < maxcounter; i++) {
//        List<String> someList = map.values().stream().flatMap(c -> c.stream()).collect(Collectors.toList());
//    }
//    System.out.println(System.currentTimeMillis() - millis);
//
//    System.out.println("2 parallel stream flatmap");
//    millis = System.currentTimeMillis();
//    for (int i = 0; i < maxcounter; i++) {
//        List<String> someList = map.values().parallelStream().flatMap(c -> c.stream()).collect(Collectors.toList());
//    }
//    System.out.println(System.currentTimeMillis() - millis);
//
//    System.out.println("2 foreach");
//    millis = System.currentTimeMillis();
//    for (int i = 0; i < maxcounter; i++) {
//        List<String> mylist = new ArrayList<String>();
//        map.values().forEach(mylist::addAll);
//    }
//    System.out.println(System.currentTimeMillis() - millis);
//
//    System.out.println("2 for");
//    millis = System.currentTimeMillis();
//    for (int i = 0; i < maxcounter; i++) {
//        List<String> mylist = new ArrayList<String>();
//        for (List<String> item : map.values()) {
//            mylist.addAll(item);
//        }
//    }
//    System.out.println(System.currentTimeMillis() - millis);
//

}
