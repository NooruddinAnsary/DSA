package Sorting;

public class BubbleSort {
    public static void bubbleSort(int num[]){
        int len = num.length-1;
        System.out.println(len);
        for(int i = 0; i<len; i++){
            for(int j = 0; j<len-i; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }

            }
        }
    }
    public static void showSort(int num[]){
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String args[]){
        int num[] ={5, 4, 3, 2, 1};
        bubbleSort(num);
        showSort(num);
    }
}
