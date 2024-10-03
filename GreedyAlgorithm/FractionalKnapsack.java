package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int cap = 50;
        int value = 0;

        double ratio[][] = new double[val.length][2];
        // 0th col => idx ;  1st col => ratio

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        int n = ratio.length;
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        for (int i = n-1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (cap > weight[idx]) {
                cap -= weight[idx];
                value += val[idx];
            }
            else{
                value += (ratio[i][1] * cap);
                break;
            }
        }
     
        System.out.println(value);
    }
}
