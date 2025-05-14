package com.algo.dynamicProgramming;

public class Knapsack {
    // Function to solve 0/1 Knapsack problem
    public static int generateMatrix(int[] weights, int[] values, int capacity) {
        int n = values.length;
        int[][] dp = new int[n + 1][capacity + 1];

        // Build dp table
        for (int i = 1; i <= n; i++) {
            int currWeight = weights[i - 1];
            int currValue = values[i - 1];
            for (int w = 0; w <= capacity; w++) {
                if (currWeight <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - currWeight] + currValue);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity]; // Max value for n items and given capacity
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] values = { 60, 100, 120 }; // Values of items
        int[] weights = { 10, 20, 30 }; // Weights of items
        int capacity = 50; // Maximum weight capacity

        int maxValue = generateMatrix(weights, values, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }

}
