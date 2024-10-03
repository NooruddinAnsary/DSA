package DevideAndConquer;

import java.util.Arrays;

public class MergeSortString {


    public static void mergeSortstr(String arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSortstr(arr, si, mid); //left part
        mergeSortstr(arr, mid+1, ei); //right part
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei){
        String temp[] = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i <=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<= 0){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i<= mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(k= 0,i=si ; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]){
        String arr[] = {"hello", "bello", "gello"};
        mergeSortstr(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

