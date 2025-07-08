package com.algo.divideNConquer;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println("Square root of 16 is: " + sqrt(15));
        System.out.println("Square root of 16 is: " + sqrt(16));
        System.out.println("Square root of 17 is: " + sqrt(17));
    }

    private static int sqrt(int num) {
        int low = 1, high = num / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int square = mid * mid;

            if (square == num) {
                return mid; // Found exact square root
            } else if (square < num) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        return high; // Return the floor of the square root
    }
}
