package JAVA;
import java.util.*;
public class InvertedStarPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
          //for(int j = 0; i < (n-i)+1; j++) // also work
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
