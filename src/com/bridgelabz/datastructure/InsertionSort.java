package com.bridgelabz.datastructure;

import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] array) {

        for (int i = 0; i < (array.length-1); i++) {
            int num = array[i+1];

            while (num < array[i]) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = num;
        }
    }

    public static void main(String[] args) {
        int[] data = { 2, 6, 4, 9, 8, 5 };
        InsertionSort insert = new InsertionSort();
        insert.insertionSort(data);
        System.out.println("Sorted Array : ");
        System.out.println(Arrays.toString(data));

    }
}
