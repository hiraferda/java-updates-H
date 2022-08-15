package com.cydeo.HW;
import java.util.*;
public class CountValues {
    public static void main(String[] args) {
        List<Integer> c = Arrays.asList(1, 2, 3, 4);
        int count = countIf(c, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }

    private static <T>int countIf(List<T> c, UnaryPredicate<T> p) {
        int count = 0;
        for (T number : c) {
            if(p.test(number)){
                ++count;
            }
        }
        return count;
    }
}
