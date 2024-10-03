package BinaryTree;
public class PostTraversal {
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
    static class B extends BT{
        public void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {
        int nodes[] ={1, 2, 4, -1, -1, 5, -1, -1, 3,  -1, 6, -1, -1};
        B bt = new B();
        Node root = bt.builtTree(nodes);
        bt.postorder(root);
    }
}
