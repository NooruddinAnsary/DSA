package Sorting;

public class SelectionSort {
    public static void selectionSort(int num[]){
        int len = num.length;
        for(int i=0; i<len-1; i++){
            int minPos = i;
            for(int j=i+1; j<len; j++){
                if(num[minPos]> num[j]){     //increasing order
                //if(num[minPos] < num[j]){   //decreasing order
                    minPos = j;
                }
            }
            //Swap
            int temp = num[minPos];
            num[minPos] = num[i];
            num[i] = temp;
        }
    }
    public static void showSort(int num[]){
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String args[]){
        int num[] = {5, 4, 3, 2, 1};
        selectionSort(num);
        showSort(num);
    }
}
