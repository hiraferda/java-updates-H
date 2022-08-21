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

       // List<Apple> heavyApple = filterApples(inventory, new AppleWeightPredicate());
        //System.out.println(heavyApple);
        //List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        //System.out.println(greenApple);

        //List<Apple> green = filterApples(inventory, apple->apple.getColor().equals(Color.GREEN));
        //System.out.println(green);

        inventory.stream()
                .filter(apple->apple.getColor().equals(Color.GREEN))
                .forEach(System.out::println);

    }

   /* private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate obj){
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if(obj.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }*/
}
