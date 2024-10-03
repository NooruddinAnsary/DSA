package Queue;

import java.util.*;

public class DequeB {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        dq.addLast(5);
        dq.removeFirst();
        System.out.println(dq);
    }
}
