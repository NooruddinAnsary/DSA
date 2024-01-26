package Array;

public class LargestNumber {
    public static int largest(int num[]){
        int large = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            if(num[i]>large){
                large = num[i];
            }
        }
        return large;
    }
    public static void main(String args[]){
        int num[] = {2, 5, 98, 8, 7, 10, 45, 21, 65};
        System.out.println(largest(num));   }
}
