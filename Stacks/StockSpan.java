package Stacks;

import java.util.Stack;

public class StockSpan {
    public static void stocSpanfunc(int stock[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < span.length; i++) {
            
            int currPrice = stock[i];
            while (!s.isEmpty() && currPrice > stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i+1;
            }
            else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;

            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stock[]={100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stock.length];
        stocSpanfunc(stock, span);
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i]);
        }
    }
}