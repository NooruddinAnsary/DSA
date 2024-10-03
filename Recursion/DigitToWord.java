package Recursion;

public class DigitToWord {
    public static void word(String arr[], int i, int n){
        if(n==0){
            return;
        } 
        word(arr, i+1, n/10);
        int digit = n%10;
        System.out.print(arr[digit]+" ");
    }
    public static void main(String args[]){
        
        String arr[]={"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        word(arr, 0, 2019);
    }
}
