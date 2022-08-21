package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.out;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4, 5,2);
//        list.forEach(System.out::println);


        System.out.println("Filter");
        list.stream()
                .filter(i -> i%2==0)
                .forEach(System.out::println);

        System.out.println("Distinct");
        Stream<Integer> str = list.stream()
                .filter(i -> i%2==0)
                .distinct();

        str.forEach(System.out::println);

        System.out.println("Limit");
        list.stream()
                .filter(i -> i%2==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("Skip");
        list.stream()
                .filter(i -> i%2==0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("Map");
        list.stream()
                .map(number -> number*2)
                .filter(i -> i%3==0)
                .forEach(System.out::println);

        System.out.println("---------------------------------------");

        list.stream()
                .map(n -> n+1)
                .skip(2)
                .forEach(System.out::println);
    }
}
