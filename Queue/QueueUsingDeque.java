package Queue;

import java.util.*;

public class QueueUsingDeque {
    static class StackB{
        Deque<Integer> dq = new LinkedList<>();
        public void add(int data){
            dq.addLast(data);
        }
        public int remove(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        StackB s = new StackB();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.peek());
    }
}
