package JAVA;
import java.util.*;
public class LargestThreeNumb {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of A: ");
        int a = sc.nextInt();

        System.out.print("Enter number of B: ");
        int b = sc.nextInt();

        System.out.print("Enter number of C: ");
        int c = sc.nextInt();

        if((a>b) && (a>c)){
            System.out.println("A is greater.");
        }
        else if(b>c){
            System.out.println("B");

        }
        else{
            System.out.println("C");
        }


        sc.close();
    }
}
