package com.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("test", 1);
        map.put("test2", 2);
        map.put("test3", 3);
        map.put("test4", 4);
        map.put("test5", 5);
        map.put("test6", 6);

//        map.values().stream();

        List<Integer> collect = map.values().stream().collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect1 = map.values().stream().filter(s -> s >= 3).collect(Collectors.toList());

        System.out.println(collect1);


    }

}
