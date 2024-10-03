package GreedyAlgorithm;

import java.util.*;

public class CanonicalCoinSystem {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        //Integer coins[] ={419,408,186,83};
        Arrays.sort(coins, Comparator.reverseOrder());

        int amount = 6249;
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println(amount);
        System.out.println("Total (min) coins used =" + count);
        for (int coin : ans) {
            System.out.println("Coin: " + coin);
        }
    }
}
