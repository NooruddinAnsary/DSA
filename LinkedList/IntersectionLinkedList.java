package LinkedList;
public class IntersectionLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            this.next =null;
        }
    }
    public static Node head;
    public static Node tail;
    void add(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    void display(){
        Node temp = head;
        if (temp == null) {
            System.out.println("Empty");
        }
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static Node getMergingPoint(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null){
            while (temp2 != null) {
                if (temp2 == temp1) {
                    return temp1;
                }
                temp2 = temp2.next;
            }
            temp2 = head2;
            temp1 = temp1.next;
        }
        return null;
    }


    public static void main(String[] args) {
        Node head1 = new Node(4);
        Node head2 = new Node(1);
        Node newNode = new Node(5);
        head1.next = newNode;
        newNode = new Node(6);
        head1.next.next = newNode;
        newNode = new Node(7);
        head1.next.next.next =newNode;
        newNode = new Node(2);
        head2.next = newNode;
        newNode = new Node(3);
        head2.next.next = newNode;
        newNode = new Node(6);
        head2.next.next.next = head1.next.next;

        Node merging = getMergingPoint(head1 , head2);
        System.out.println(merging.data);

    }
}
