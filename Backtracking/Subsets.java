package Backtracking;

public class Subsets {
    public static void subset(String str, String ans, int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        subset(str, ans+str.charAt(i), i+1);
        subset(str, ans, i+1);
    }
    public static void main(String args[]){
        subset("abc", "", 0);

    }
}
