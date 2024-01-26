package Array;
public class LinearSearch {
    public static int lSearch(int num[], int key){
        for(int i = 0; i<num.length; i++){
            if(num[i]==key){
               return i; 
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int num[] = {2, 5, 9, 8, 7, 10, 45, 21, 65};
        int key= 64;
        int index = lSearch(num, key);
        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("key is "+index);
        }
        
    }
}
