package JAVA;
import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float rad = sc.nextInt();
        float area = 3.14f * rad * rad;
        System.out.println(area);
        sc.close();
    }
}
