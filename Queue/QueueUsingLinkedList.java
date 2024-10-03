package Queue;

public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class QueueA{
        static Node head = null;
        static Node tail = null;
        public boolean isEmpty(){
            return head == null && tail==null;
        }

        

        //add
        public void add(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }
            tail.next=newNode;
            tail = newNode;
        }

        //remove
        public int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if(tail == head){
                tail = head = null;
            }else{
                head =head.next;
            }
            return front;
        }

        //peek
        public int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        QueueA qLL = new QueueA();
        qLL.add(1);
        qLL.add(2);
        qLL.add(3);
        
        System.out.println("=============== Result ================");
        while (!qLL.isEmpty()) {
            System.out.print("\t"+qLL.peek()+" ");
            qLL.remove();
        }
        System.out.println();
        System.out.println("=============== End ================");
    }
}
