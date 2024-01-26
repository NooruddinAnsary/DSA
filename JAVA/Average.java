package JAVA;

import java.util.*;
public class Average {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        int average = ( a + b + c)/3;
        System.out.println("\nAverage = "+ average);
        sc.close();
    }
    
}
