package com.cydeo;

public class AppleWeightPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 200;
    }
}
