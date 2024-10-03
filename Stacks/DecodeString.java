package Stacks;

import java.util.*;

public class DecodeString {
    public static void decode(String str) {
        Stack<String> stk = new Stack<>();
        Stack<Integer> numstk = new Stack<>();
        int num =0;
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            String ch = ""+str.charAt(i);

            if (Character.isDigit(ch1)) {
                num = (num*10) + (ch1 - '0');
            }

            else if(!ch.equals("]")) {
                if(ch.equals("[")){
                    numstk.push(num);
                    num=0;
                }
                stk.push(ch);
            } 
            else {
                String s = "";
                while (!stk.peek().equals("[")) {
                    s=stk.pop()+s;
                    
                }
                stk.pop();
                int n = numstk.pop();
                System.out.println(n);
                stk.push(s.repeat(n));
                
            }

        }
        String str2 ="";
        while (!stk.isEmpty()) {
            String str1 =stk.pop();
            str2= str1 + str2;
        }
        System.out.println(str2);

    }

    public static void main(String[] args) {
        String str = "2[a3[c2[x]]y]";
        decode(str);

    }
}
