package JAVA;
import java.util.*;

public class SumOfNaaturalNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range: ");
        int range = sc.nextInt();
        int count = 0;
        int sum = 0;
        while(count <= range){

            sum += count;
            count++;
        }
        System.out.println(sum);
        sc.close();

    }
}
