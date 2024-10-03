package GreedyAlgorithm;

public class MaxBalancedStringPartition {
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int r=0;
        int l=0;
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'L') {
                l++;
            }else{
                r++;
            }
            if (r==l) {
                count++;
                l=0;
                r=0;
            }
        }
        System.out.println(count);
    }
}
