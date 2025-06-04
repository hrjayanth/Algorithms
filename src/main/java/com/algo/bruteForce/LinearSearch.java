package com.algo.bruteForce;

import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 7, 5, 4, 2);
        Integer searchElement = 17;
        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == searchElement) {
                found = true;
                System.out.println("Element " + searchElement + " found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + searchElement + " is not present in the list");
        }
    }
}
