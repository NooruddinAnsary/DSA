package Recursion;

public class PairProblem {
    public static int pair(int n) {
        if(n<=1){
            return 1;
        }
        int single = pair(n-1);
        int pairf = (n-1) * pair(n-2);
        return single+pairf;
    }
    public static void main(String[] args) {
        int n =4;
        System.out.println("Ways: "+pair(n));
    }
}
