package com.algo.bruteForce;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 6, 2, 1 };

        System.out.println("Array before Sorting");
        System.out.println(Arrays.toString(arr));

        // pebbleSortArray(arr);

        bubbleSortArray(arr);

        System.out.println("Array after Sorting");
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Pass " + (i + 1));
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    arr[j] = arr[j] + arr[j - 1];
                    arr[j - 1] = arr[j] - arr[j - 1];
                    arr[j] = arr[j] - arr[j - 1];
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void pebbleSortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Pass " + (i + 1));
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
