package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<Apple>();
        inventory.add(new Apple(350,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));
    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate obj){
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if(obj.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
