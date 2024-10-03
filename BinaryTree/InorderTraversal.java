package BinaryTree;

public class InorderTraversal {
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

    static class BT {
        static int i = -1;

        public Node builtTree(int nodes[]) {
            i++;
            if (nodes[i] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[i]);
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);
            return newNode;
        }
    }

    static class BinTrr extends BT {
        public static final String BT = null;

        public void inorder(Node root) {
            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
      
        BT bt = new BT();
        Node root = bt.builtTree(nodes);
        BinTrr bt1 = new BinTrr();
        
        bt1.inorder(root);

    }

}
