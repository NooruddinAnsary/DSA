package JAVA;
import java.util.*;
public class CharacterPattern {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        char character = 'A';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(character++);
            }
            System.out.println();
        }
        sc.close();
    }
}
