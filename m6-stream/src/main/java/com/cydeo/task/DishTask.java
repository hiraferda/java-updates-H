package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                .map(dish->dish.getName())//.map(Dish::getName))
                .forEach(System.out::println);

        //Print the length of the name of each dish
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        //Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(i->i.getCalories()>300)
                .map(dish -> dish.getName())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("----------------------------------------");

        //Print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories))
                  //.map(dish->dish.getName())
                .map(Dish::getName)
                //.sorted()
                .forEach(System.out::println);
//ask Ozzy

        System.out.println("----------------------------------------");

        List<String> stringList = Arrays.asList("reyhan", "Gulcin","Lucy", "rnurbanu", "Hira");
        stringList.stream()
                .filter(s->s.startsWith("r"))
                .sorted()
                .forEach(System.out::println);
    }
}
