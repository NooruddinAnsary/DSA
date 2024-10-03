package BST;

import java.util.ArrayList;

public class TwoSum {
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
    static boolean res = false;
    static ArrayList<Integer> list  = new ArrayList<>();

    static void inorder(Node root, int sum){
        if (root == null) {
            return;
        }

        inorder(root.left, sum);
        list.add(sum - root.data);
        inorder(root.right, sum);
    }

    static void twoSum(Node root){
       if (root == null) {
            return;
       }
       twoSum(root.left);

       if (list.contains(root.data)) {
     
        res = true;
       }
       twoSum(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(13);
        root.left.left = new Node(4);
        root.left.right = new Node(69);
        root.right = new Node(5);
        root.right.left = new Node(96);
        root.right.right = new Node(44);
        

        Node root1 = new Node(8);
        root1.left = new Node(23);
        root1.left.left = new Node(89);
        root1.left.right = new Node(28);
        root1.right = new Node(11);
        root1.right.left = new Node(9);
        root1.right.right = new Node(14);

        inorder(root, 111);


        twoSum(root1);
        System.out.println(res);
    }
}
