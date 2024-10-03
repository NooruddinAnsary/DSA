package Recursion;

public class Tiling {
    public static int fill(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return fill(n-1)+fill(n-2);

    }
    public static void main(String[] args) {
        System.out.println(fill(4));
    }
}
