package com.Task;

public class Weight implements AppleCriteria{
    @Override
    public String test(Apple apple) {
        return "The apple is " + apple.getWeight()+ "g";
    }
}
