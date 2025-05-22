package com.algo.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 5, 10, 25};
        int amount = 63;

        findMinCoins(coins, amount);
    }

    private static void findMinCoins(int[] coins, int amount) {
        Arrays.sort(coins);
        List<Integer> denominations = new ArrayList<>();
        int n = coins.length;

        for(int i = n - 1; i >= 0; i--) {
            while(amount >= coins[i]) {
                amount -= coins[i];
                denominations.add(coins[i]);
            }
        }

        if (amount != 0) {
            System.out.println("Cannot make exact change with the given denominations.");
        } else {
            System.out.println("Minimum coins used (Greedy): " + denominations);
        }
    }
}
