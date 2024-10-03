package Recursion;

public class Occurence {
    public static void indices(int arr[], int i, int key) {
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        indices(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,2,2};
        int key = 2;
        indices(arr, 0, key);
    }
}
