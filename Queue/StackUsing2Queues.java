package Queue;

import java.util.*;
public class StackUsing2Queues {
    static class StackB{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();


        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        //add
        public void push(int data){
            if (!q1.isEmpty()) {
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }

        //remove
        public int pop(){
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top =-1;
            //case-1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            }

            //case-2
            else{
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        //peek
        public int peek(){
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = -1;
            //case-1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            }
            
            //case-2
            else{
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }

    }
    public static void main(String[] args) {
        StackB stk = new StackB();
        stk.push(1);
        stk.push(2);
        stk.push(3);

        while (!stk.isEmpty()) {
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
