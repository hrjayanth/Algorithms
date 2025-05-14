package com.algo.dynamicProgramming;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("TopDownApproach: " + topDownApproach(6));
        System.out.println("BottomUpApproach: " + topDownApproach(6));
    }

    public static int topDownApproach(int n) {
        if (n <= 1)
            return n;

        return topDownApproach(n - 1) + topDownApproach(n - 2);
    }

    public static int bottomUpApproach(int n) {
        if (n <= 1)
            return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
