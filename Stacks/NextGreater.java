package Stacks;

import java.util.Stack;

public class NextGreater {
    public static void findNextGreater(int arr[], int nextGreater[]){
        Stack<Integer> s = new Stack<>();
        
        for (int i = arr.length-1 ; i >= 0 ; i--)  {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        //Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        findNextGreater(arr, nextGreater);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(nextGreater[i]);
        }

    }
}
