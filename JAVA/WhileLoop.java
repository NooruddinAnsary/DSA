package JAVA;
import java.util.*;
public class WhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter any number: ");
            int n =sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            if(n == 3){
                continue;
            }
            System.out.println(n);
        }
        sc.close();
    }
}
