package BitManipulation;

public class FastExponentiation {
    public static int exponentiation(int a ,int n) {
        int ans = 1;
        while(n>0){
            if((n&1)!=0){
                ans *= a;
            }
            a *= a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(exponentiation(3, 5));  
    }
}
