package BinaryTree;

public class PreorderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }

    }
    static class BT{
        static int i=-1;
        public Node builtTree(int nodes[]){
            i++;
            if(nodes[i] == -1){
                return null;
            }
            Node newNode = new Node(nodes[i]);
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);
            return newNode;
        }
        public void preorder( Node root){
            if(root == null){
               return; 
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
            
        }
    }
    public static void main(String[] args) {
        int nodes[] ={1, 2, 4, -1, -1, 5, -1, -1, 6, -1, -1};
        BT bt = new BT();
        Node root = bt.builtTree(nodes);
        bt.preorder(root);
    }
}
