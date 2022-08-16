package com.Task;

public class Weight implements AppleCriteria{
    @Override
    public String test(Apple apple) {
        if(apple.getWeight().equals(AppleCriteriaWeight.HEAVY)){
            return "Apple is " + AppleCriteriaWeight.HEAVY;
        }
        return "Apple is " + AppleCriteriaWeight.LIGHT;
    }
}
