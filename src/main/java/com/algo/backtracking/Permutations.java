package com.algo.backtracking;

import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("Initial Array: " + Arrays.toString(arr));
        generatePermutations(arr, 0);
    }

    private static void generatePermutations(int[] arr, int index) {
        if(index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutations(arr, i + 1);
            swap(arr, index, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
