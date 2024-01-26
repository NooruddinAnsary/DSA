package Array;

public class ReverseArray {
    public static void reverse(int num[]){
        int len = num.length-1;
    
        for(int i=0; i<len; i++){
        int temp = num[len-i];
        num[len-i]=num[i];
        num[i]=temp;

        }
        
    }
    public static void main(String args[]){
        int num[]={1,40,51,76,81,9};
        reverse(num);
        for(int i =0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
