package com.map;

import java.util.List;
import java.util.stream.Stream;

public class MapAndFlatMapExamples {
    public static void main(String[] args) {

        var list = List.of(2, 4, 76, 45, 2);


//        list.stream().map(i -> i * 10).forEach(j -> System.out.println(j));
//        list.stream().map(i -> i * 10).forEach(System.out::println);

        list.stream().flatMap(i -> Stream.of(i * 10, i + 10)).forEach(System.out::println);
    }
}
