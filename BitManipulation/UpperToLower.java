package BitManipulation;

import java.util.Scanner;

public class UpperToLower {
    public static void main(String args[]){
        while (true) {
            System.out.print("Enter any character: ");
            Scanner sc = new Scanner(System.in);
            char letter = sc.next().charAt(0);
            System.out.println((char) (letter|' '));        
        sc.close();
        }

    }
}