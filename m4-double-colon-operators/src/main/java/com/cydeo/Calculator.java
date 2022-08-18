package com.cydeo;

import java.util.function.BiFunction;

public class Calculator {
    public static void main(String[] args) {
        //Calculate addition = (x,y) -> System.out.println(x+y);
        Calculate addition = (x,y) -> Calculator.findSum(x,y);
        addition.calculate(7,9);
        //double colon
        Calculate s2 = Calculator::findSum;
        s2.calculate(6,7);



    }
    public static void findSum(int x,int y){
        System.out.println("Sum: " + (x+y));
    }

    public void findMultiply(int x,int y){
        System.out.println("Multiply" + (x*y));
    }
}
