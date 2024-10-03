package Recursion;

public class Fibonacci {
    public static int fibo(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int s = fibo(n-1)+fibo(n-2);
        return s;

    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(fibo(i)+" ");
        }
    }
}
