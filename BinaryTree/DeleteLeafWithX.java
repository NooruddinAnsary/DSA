package BinaryTree;

public class DeleteLeafWithX {
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

    static Node deleteLeaf(Node root, int target) {
        if (root == null) {
            return null;
        }

        root.left = deleteLeaf(root.left, target);
        root.right = deleteLeaf(root.right, target);

        if (root.left == null && root.right == null && root.data == target) {
            return null;
        }
        return root;
    }

    static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        
        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(1);
        root.right.right = new Node(3);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(3);
        deleteLeaf(root, 3);
        preOrder(root);
    }

}
