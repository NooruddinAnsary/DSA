package Queue;

import java.util.*;

public class MaxOfAllSubarray {
    public static void MaxSubarray(int arr[], int k, int n){
        Deque<Integer> dq = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && dq.peekLast() < arr[i]) {
                dq.removeLast();
            }
            dq.addLast(arr[i]);
        }
        al.add(dq.peekFirst());

        for (int i = k; i < n; i++) {
            if (dq.peekFirst() == arr[i-k]) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && dq.peekLast() < arr[i]) {
                dq.removeLast();
            }
            dq.addLast(arr[i]);
            al.add(dq.peekFirst());
            
        }
        System.out.println(al);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        MaxSubarray(arr, 3, 9);
    }
}
