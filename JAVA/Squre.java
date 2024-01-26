package JAVA;

import java.util.Scanner;

public class Squre {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of a square: ");
        int a =sc.nextInt();

        int squre = a * a;
        System.out.println("Squre = "+squre);
        sc.close();
    }
}
