package BitManipulation;

public class OddOrEven {
    public static void check(int n){
        int bitMask = 1;
        if((n&bitMask) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        check(11);
        check(888);
    }
}
