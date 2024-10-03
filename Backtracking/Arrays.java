package Backtracking;

public class Arrays {
    public static void print(int arr[],int si, int ei){
        if(si==ei){
            //System.out.println(arr);
            return;
        }
        //System.out.println(arr[si]);
        print(arr, si+1, ei);
        arr[si] -= 2;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        print(arr,0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
