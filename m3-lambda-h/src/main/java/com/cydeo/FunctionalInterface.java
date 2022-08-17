package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {
        //******************Predicate***********************//
        Predicate<Integer> lesserThan = i -> i<18;
        System.out.println(lesserThan.test(20));

        //******************Consumer***********************//
        Consumer<Integer> display = i -> System.out.println();
        display.accept(10);

        //******************BiConsumer***********************//
        BiConsumer<Integer, Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(1,2);

        //******************Function***********************//
        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Hira"));

        //******************BiFunction***********************//
        BiFunction<Integer, Integer, Integer> function = (x1,y1) -> x1+y1;
        System.out.println(function.apply(2,3));

        //******************Supplier***********************//
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
    }
}
