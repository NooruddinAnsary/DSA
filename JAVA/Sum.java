package JAVA;

import java.util.*;
public class Sum {
    public static void main(String[] args) {
        //single line code
        /*multi line 
        comment */
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum = "+sum);


        String input = sc.next();
        System.out.println(input);

        String str = sc.nextLine();
        System.out.println(str);
        sc.close();
    }
    
}
