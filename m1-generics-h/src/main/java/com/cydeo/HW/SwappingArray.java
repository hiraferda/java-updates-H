package com.cydeo.HW;

public class SwappingArray<T> {

    public static <T> T[] swap(T[] array, int index, int index2){
        T temp = array[index];
        array[index] = array[index2];
        array[index2] = temp;
        return array;
    }
}
/*
Write a generic method to exchange the positions of two different elements in
array.
 */