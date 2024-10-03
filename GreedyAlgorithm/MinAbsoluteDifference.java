package GreedyAlgorithm;

import java.util.Arrays;

public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int arr2[] = {2, 2, 5};

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int minDif = 0;

        for (int i = 0; i < arr2.length; i++) {
            minDif += Math.abs(arr[i] - arr2[i]);
        }
        System.out.println(minDif);
    }
}
