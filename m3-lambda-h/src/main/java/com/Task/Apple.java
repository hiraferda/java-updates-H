package com.Task;

public class Apple {

    private int weight;
    private AppleCriteriaColor color;

    public Apple(int weight, AppleCriteriaColor color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public AppleCriteriaColor getColor() {
        return color;
    }

    public void setColor(AppleCriteriaColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}
