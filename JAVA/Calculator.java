package JAVA;
import java.util.*;
public class Calculator {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();
            
            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            
            System.out.print("Enter an Operator: ");
            char operator = sc.next().charAt(0);
            
            switch(operator){
                
                case '+' -> System.out.println(a+b);
                case '-' -> System.out.println(a-b);
                case '*' -> System.out.println(a*b);
                case '/' -> System.out.println(a/b);
                case '%' -> System.out.println(a%b);
                default -> System.out.println("invalid");
            }
        }
    }
}
