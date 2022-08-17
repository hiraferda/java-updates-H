package com.Task;
import com.cydeo.ApplePredicate;

import java.util.*;
public class prettyPrintAppleTask {
    public static void main(String[] args) {
        Apple apple = new Apple(150, AppleCriteriaColor.GREEN);
        Apple apple2 = new Apple(89, AppleCriteriaColor.RED);
        List<Apple> apples = new ArrayList<Apple>();
        apples.add(apple);
        //System.out.println(apple);
        apples.add(apple2);
    }
    public static void prettyPrintApple(List<Apple> inventory, AppleCriteria appleCriteria) {
        for (Apple apple : inventory) {
            String output = appleCriteria.test(apple);
            System.out.println(output);
        }
    }
}
