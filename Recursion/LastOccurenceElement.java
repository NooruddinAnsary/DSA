package Recursion;

public class LastOccurenceElement {
    public static int laststOccurence(int arr[], int i, int key) {
        if(i == -1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
      
        return laststOccurence(arr, i-1, key);
            
      
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,4,2,5,6};
        int key = 6;
        int len = arr.length-1;
        if(laststOccurence(arr, len, key) != -1){
            System.out.println("found");
        }
        else{
            System.out.println(" not found"); 
        }
        
    }
}
