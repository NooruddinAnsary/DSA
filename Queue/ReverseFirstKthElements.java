package Queue;
import java.util.*;
public class ReverseFirstKthElements {
    public static void reverse(Queue<Integer> q, int k){
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        for (int j = k; j < q.size(); j++) {
            q.add(q.poll());
        }
    }
    public static void main(String[] args) {
        int k =5;
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);

        reverse(q, k);
        while (!q.isEmpty()) {
            System.out.print(q.poll()+" ");
        }
        

    }
}
