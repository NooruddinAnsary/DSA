package BST;

public class KthSmallestElement {
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
    static int count = 0;
    static int smallest(Node root, int k){
        if(root==null)return -1;
        int left =smallest(root.left,k);
        if(left!=-1)return left;
        count++;
        if(count==k)return root.data;
        return smallest(root.right,k);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(11);
        // root.right.left = new Node(3);
        root.right.right = new Node(12);

        int k = 2;
      
        int ans = smallest(root, k);
        System.out.println(ans);
    }
}
