package Recursion;

public class SumOfNaturalNum {
    
    public static int printNum(int n) {
        if(n==0){
            return 0;
        }
       int x = n + printNum(n-1);
        return x;
    }
    public static void main(String[] args) {
        System.out.println(printNum(10)); 
    }
}
