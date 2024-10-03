package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class StackB{
        Deque<Integer> dq = new LinkedList<>();
        public void push(int data){
            dq.addLast(data);
        }
        public int pop(){
            return dq.removeLast();
        }
        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String[] args) {
        StackB s = new StackB();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
