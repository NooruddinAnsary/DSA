package GreedyAlgorithm;

public class KthLargestOddNum {
    public static void main(String[] args) {
        int l=-3;
        int r=3;
        int k=4;
        int count = 0;

        for (int i = r; i>=l; i--) {

            if(i%2!=0){
                count++;
                if(k==count){
                    System.out.println(i);
                    return;
                }
            }
        }
        if(count<k){
            System.out.println("out of bound");
        }
    }
}
