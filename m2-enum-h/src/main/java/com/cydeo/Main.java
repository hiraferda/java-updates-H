package com.cydeo;

public class Main {
    public static void main(String[] args) {
        System.out.println("How to access a constant");

        Currency c = Currency.DIME;

        System.out.println(c);

        System.out.println("How to get all constants?");
        Currency[] currencies = Currency.values();

        for (Currency currency: currencies){
            System.out.println(currency);
        }

        System.out.println("How to use switch case with enums?");

        switch (Currency.PENNY){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It's 5 cent");
                break;
            case DIME:
                System.out.println("It's 10 cent");
                break;
            case QUARTER:
                System.out.println("It's 25 cent");
                break;
        }

        calculate(3.4,78,MathOperations.DIVIDE);

        System.out.println("How to retrieve the constant value?");

        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.DIME.getValue());
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.NICKLE.getValue());

    }
    private static void calculate(double x, double y, MathOperations operations){
        switch (operations){
            case MULTIPLY:
                System.out.println(x*x);
                break;
            case ADD:
                System.out.println(x+y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
            case SUBTRACT:
                System.out.println(x-y);
                break;
        }
    }
}
