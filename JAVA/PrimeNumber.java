package JAVA;
import java.util.*;
public class PrimeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter Any Number: ");
            int n = sc.nextInt();
            if(n<=0){
                break;
            }
            
            boolean flag = false;

            for(int i=2; i<= Math.sqrt(n); i++){
                if(n%i==0){
                    flag = true;
                }
            }
            if(flag == false){
                System.out.println("prime");
            }
            else{
                System.out.println("Not prime");
            }

        }
        sc.close();
        
    }
}