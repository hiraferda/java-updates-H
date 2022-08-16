package com.Task;

public class Apple {

    private AppleCriteriaWeight weight;
    private AppleCriteriaColor color;

    public Apple(AppleCriteriaWeight weight, AppleCriteriaColor color) {
        this.weight = weight;
        this.color = color;
    }

    public AppleCriteriaWeight getWeight() {
        return weight;
    }

    public void setWeight(AppleCriteriaWeight weight) {
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
