package BST;

public class RangeSumBST{
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int sum = 0;
    static void printSumRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printSumRange(root.left, k1, k2);
            sum += root.data;
            System.out.print(root.data + " ");
            printSumRange(root.right, k1, k2);
        } else if (root.data > k1) {
            printSumRange(root.left, k1, k2);
        } else {
            printSumRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(11);
        //root.right.left = new Node(3);
        root.right.right = new Node(12);
        printSumRange(root, 3, 6);
        System.out.print("= ");
        System.out.println(sum);
    }
}