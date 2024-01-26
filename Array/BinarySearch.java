package Array;

public class BinarySearch {
    public static int getElement(int num[], int key){
        int start=0, end=num.length-1;
        while(start <= end){
            int mid =(start+end)/2;

            if(num[mid] == key){
                return mid;
            }
            if(num[mid] < key){//right
                start = mid+1;
            }
            else{//left
                end = mid-1;
            }
        }
        return -1;
        
        
    }
    public static void main(String args[]){
        int num[] = {2, 5, 9, 8, 7, 10, 45};
        int key = 45;
        System.out.println("index is "+getElement(num, key));

    }
}
