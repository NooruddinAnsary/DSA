package JAVA;
import java.util.*;
public class ReverseNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;

        while(n > 0){
           int rem = n % 10;
            System.out.print(rem);
            temp = (temp * 10)+rem;
            n/=10;

        }
        System.out.println();
        System.out.println(temp);
        sc.close();
    }
}
