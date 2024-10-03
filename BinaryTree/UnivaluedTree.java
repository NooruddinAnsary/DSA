package BinaryTree;

public class UnivaluedTree {
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
    static boolean isUnival(Node root){
        if(root == null){
            return true;
        }
        if(root.left != null && root.left.data != root.data){
            return false;
        }
        if(root.right != null && root.right.data != root.data){
            return false;
        }
        boolean lu = isUnival(root.left);
        boolean ru = isUnival(root.right);
        return lu && ru;

    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        root.right.left = new Node(2);
        root.right.right = new Node(2);
        System.out.println(isUnival(root));
    }
}
