package Queue;

import java.util.*;

public class GenerateBinaryNumber {
    public static void genrateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        ArrayList<String> str = new ArrayList<>();
        q.add("1");
        while (n!=0) {
            String s = q.peek();
            str.add(s);
            
            q.add(s+"0");
            q.add(s+"1");
            q.remove();
            
            n--;
        }
        System.out.println(str);
        
    }

    public static void main(String[] args) {
        genrateBinary(6);
    }
}
