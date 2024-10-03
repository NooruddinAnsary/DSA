package LinkedList;
public class CircularLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void traverse() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Does not exist any Node");
            
        } else {
            do{
                System.out.println(temp.data);
                temp = temp.next;
            }
            while (temp != head);
        }
    }
    public void addFront(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            newNode.next = head;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.addFront(2);
        cl.addFront(3);
        cl.addFront(5);
        cl.traverse();

    }
}
