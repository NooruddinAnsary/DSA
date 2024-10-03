package BST;

import java.util.ArrayList;

public class ConvertBSTtoBalancedBST {
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
    static Node createBST(ArrayList<Integer> list, int st, int end) {
        if (st>end) {
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(list.get(mid));
        root.left = createBST(list, st, mid-1);
        root.right = createBST(list, mid+1, end);
        return root;
    }
    
    static void getInorder(Node root, ArrayList<Integer> list){
        if (root == null) {
            return;
        }
        
        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
    }
    static Node balanceBST(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        getInorder(root, list);
        root = createBST(list, 0, list.size()-1);
        return root;
    }
    static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root = balanceBST(root);
        preOrder(root);
    }
}
