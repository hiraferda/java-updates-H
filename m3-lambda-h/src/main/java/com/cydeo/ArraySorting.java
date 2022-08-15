package com.cydeo;

public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
        QuickSort qs = new QuickSort();
        qs.sort();
        BubbleSort bs = new BubbleSort();
        bs.sort();
    }
    private void sort(Sorting sorting){
        sorting.sort();
    }
}
