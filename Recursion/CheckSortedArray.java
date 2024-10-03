package Recursion;

public class CheckSortedArray {
    public static boolean isSortedArray(int arr[], int i) {
        if(arr.length-1 == i){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSortedArray(arr, i+1);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(isSortedArray(arr,0));
    }
}
