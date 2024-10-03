package Stacks;
//import java.util.*;

public class Palindrom {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;

        }
        public boolean isPalindrom(){
            java.util.Stack<Integer> s = new java.util.Stack<>();
            Node temp = head;
            while (temp != null) {
                s.push(temp.data);
                temp =temp.next;
            }
            temp = head;
            while (s.size() > 0) {
                if (temp.data != s.pop()) {
                    return false;
                }
                else{
                    temp =temp.next;
                }
            }
            return true;

        }
       

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(3);
        s.push(3);
        System.out.println("================================================");
        System.out.println("Palindrom: "+s.isPalindrom());
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}

