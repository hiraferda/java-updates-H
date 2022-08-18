package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> pred = (p) -> p%2 == 0 ? true:false;

        Calculator obj = new Calculator();
        Calculate s3 = obj::findMultiply;

        Calculate s4 = new Calculator():: findMultiply;

        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);


        // BiFunction<String, Integer, String> func2 = (str, i) -> String::substring;

        Function<Integer, Double> b = new MyClass()::method;

        BiFunction<MyClass, Integer, Double> b1 = MyClass::method;
    }
}
