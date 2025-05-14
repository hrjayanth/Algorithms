package com.algo.dynamicProgramming;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        int[] denominations = {1, 2, 5};
        int amount = 15;

        System.out.println(minCoins(denominations, amount));
    }

    private static int minCoins(int[] denominations, int amount) {
        int[] dp = new int[amount + 1];

        // Fill the array with some high number
        Arrays.fill(dp, 999);
        
        // If  the amount is 0, then there won't be any denominations possible. 
        // Hence setting this value to 0
        dp[0] = 0;

        for(int i = 1; i <= amount; i++) {
            for(int coin: denominations) {
                if(i >= coin) {
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}