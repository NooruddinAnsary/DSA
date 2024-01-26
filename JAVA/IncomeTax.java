package JAVA;
import java.util.*;
public class IncomeTax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income: ");
        double amount = sc.nextDouble();
        double tax;
        if(amount < 500000){
            tax = 0;
        }
        else if ( amount < 1000000){
            tax = amount * 0.2;
         
        }
        else{
            tax = amount * 0.3;
            
        }
        System.out.println("Tax = "+tax);
        sc.close();
    }
}
