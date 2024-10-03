package LinkedList;

public class Linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // point to head
        newNode.next = head; // link

        //
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newnNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx; temp -> prev
        newnNode.next = temp.next;
        temp.next = newnNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("empty");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }

        // prev => i==size-2;
        int i = 0;
        Node prev = head;
        while (i < size - 2) {
            prev = prev.next;
            i++;
        }
        int val = tail.data; // prev.next.data;
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    public void search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found " + key + " on idx = " + i);
                return;
            }
            temp = temp.next;
            i++;
        }
        System.out.println("Not found " + key);
    }

    public static int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public static int recursiveSearch(int key) {
        return helper(head, key);
    }

    public static void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void deleteNthNodeFromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next; // removeFirst
            return;
        }
        // sz-n
        int i = 1;
        Node prev = head;
        int ifind = sz - n;
        while (i < ifind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step-1 - find mid
        Node mid = findMid(head);

        // step-2 - reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head;
        // step-3 - check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    // Slow-Fast
    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // +2
            slow = slow.next; // +1
        }
        return slow; // mid = slow
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;

    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;

    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);
    }

    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node leftHead = head;
        Node rightHead = prev;
        Node nextLeft, nextRight;
        while (leftHead != null && rightHead != null) {
            nextLeft = leftHead.next;
            leftHead.next = rightHead;
            nextRight = rightHead.next;
            rightHead.next = nextLeft;

            rightHead = nextRight;
            leftHead = nextLeft;

        }
        // alternative merging
    }

    public void deleteNodeNafterMNode(int M, int N) {
        Node temp = head;
        while (temp != null) {
            for (int i = 1; i < M && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                return;
            }
            for (int i = 0; i < N && temp != null; i++) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }

    }

    public Node evenOddNode() {
        Node even = null, e = null, odd = null, o = null;

        while (head != null) {
            if (head.data % 2 == 0) {
                if (even == null) {
                    even = head;
                    e = head;
                } else {
                    e.next = head;
                    e = e.next; 
                }
            }
            else{
                if (odd == null) {
                    odd = head;
                    o = head;
                    
                }
                else{
                    o.next = head;
                    o = o.next;
                }
            }
            head = head.next;
        }
        if(e != null){
            e.next = odd;
        }
        if(o != null){
            o.next = null;
        }
        if(even != null){
            return even;
        }
        return odd;


    }

    public static void main(String[] args) {
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        Linkedlist ll = new Linkedlist();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.display();

         ll.deleteNodeNafterMNode(3 , 2);
        // ll.display();

        Node result = ll.evenOddNode();
        System.out.println("Modified list with even nodes before odd nodes:");
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
        System.out.println();

        // Linkedlist.head = ll.mergeSort(Linkedlist.head);

        // ll.zigZag();
        // ll.display();

        // // ll.addFirst(1);
        // // ll.display();

        // // ll.addFirst(36);
        // // ll.display();

        // // ll.addLast(3);
        // // ll.display();

        // // ll.addLast(4);
        // // ll.display();

        // // ll.add(2,9);
        // // ll.display();

        // // ll.removeFirst();
        // // ll.display();

        // // ll.removeLast();
        // // ll.display();

        // // System.out.println("size = "+size);
        // // ll.search(13);
        // // System.out.println(recursiveSearch(3));

        // //ll.reverse();
        // //ll.display();

        // // deleteNthNodeFromEnd(3);
        // // ll.display();
        // System.out.println(checkPalindrome());

    }
}
