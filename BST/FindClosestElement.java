package BST;

public class FindClosestElement {
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

    public static int ans = 99999999;

    static void dfs(Node root, int k) {
        if (root == null) {
            return;
        }
        int abs = Math.abs(root.data - k);
        //System.out.println(abs);
        ans = Math.min(ans, abs);

        dfs(root.left, k);
        dfs(root.right, k);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(11);
        // root.right.left = new Node(3);
        root.right.right = new Node(12);
        int k = 4;
        dfs(root, k);
        System.out.println(ans+k);


    }
}
