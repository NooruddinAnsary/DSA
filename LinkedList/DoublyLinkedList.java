package LinkedList;

public class DoublyLinkedList {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +"<-->");
           temp = temp.next;
        }
        System.out.println("null");
    }

    //add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }
    
    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //remove Last
    public int removeLast() {
        if (head == null) {
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        size--;
        if (size == 1) {
            int val = tail.data;
            head = tail = null;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    //remove first
    public int removeFirst() {
        if (head == null) {
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        size--;
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        //dll.addFirst(7);
        dll.print();

        // dll.removeFirst();
        // dll.removeLast();
        // dll.addLast(3);

        dll.reverse();
        dll.print();
        System.out.println(size);
    }
}
