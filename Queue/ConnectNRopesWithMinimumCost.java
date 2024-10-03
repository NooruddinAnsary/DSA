package Queue;

import java.util.*;

public class ConnectNRopesWithMinimumCost {
    public static int connectRopes(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int profit =0;
        while (pq.size() >= 2) {
            int p1 = pq.poll();
            int p2 = pq.poll();

            int p = p1 + p2;
            pq.add(p);
            profit += p;
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 6};
        System.out.println(connectRopes(arr)); 
    }
}
