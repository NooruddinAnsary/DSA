package Queue;
import java.util.*;
public class QueueUsingJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        
        for (int i : q) {
            System.out.println(i);
        }
    }
}
