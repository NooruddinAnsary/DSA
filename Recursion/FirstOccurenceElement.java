package Recursion;

public class FirstOccurenceElement {
    public static int firstOccurence(int arr[], int i, int key) {
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
      
        return firstOccurence(arr, i+1, key);
            
      
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int key = 5;
        if(firstOccurence(arr, 0, key) != -1){
            System.out.println("found");
        }
        else{
            System.out.println(" not found"); 
        }
        
    }
}
