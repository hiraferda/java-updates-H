package com.Task;

public class Color implements AppleCriteria{
    @Override
    public String test(Apple apple) {
        if(apple.getColor().equals(AppleCriteriaColor.GREEN)){
            return "Apple is " + AppleCriteriaColor.GREEN;
        }
        return "Apple is " + AppleCriteriaColor.RED;
    }
}
