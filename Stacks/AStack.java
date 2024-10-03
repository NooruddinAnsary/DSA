package Stacks;

import java.util.*;
public class AStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(5);
        s.push(8);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
}
