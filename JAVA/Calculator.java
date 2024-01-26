package JAVA;
import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.print("Enter an Operator: ");
        char operator = sc.next().charAt(0);
        
        switch(operator){

            case '+':System.out.println(a+b);
                        break;
            case '-': System.out.println(a-b);
                        break;
            case '*': System.out.println(a*b);
                        break;
            case '/': System.out.println(a/b);
                        break;
            case '%': System.out.println(a%b);
                        break;
            default: System.out.println("invalid");
        }
        

        sc.close();
    }
}
