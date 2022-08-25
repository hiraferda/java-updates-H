package com.cydeo.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateNotDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,6,3,6,8,9,5,3,7,3);
        Predicate<Integer> even = i->i%2==0;


    }
}
