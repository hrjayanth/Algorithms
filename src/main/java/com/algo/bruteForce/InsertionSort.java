package com.algo.bruteForce;

public class InsertionSort {
    public static void insertionSortAlgo(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];        // Current element to insert
            int j = i - 1;

            // Move elements that are greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift right
                j--;
            }

            arr[j + 1] = key;        // Insert key in correct position
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Before Sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        insertionSortAlgo(numbers);

        System.out.println("\nAfter Sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
