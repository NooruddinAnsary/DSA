package BinaryTree;

public class BinaryTree {
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
    }
    public static void main(String[] args) {
        int nodes[] ={1, 2, 4, -1, -1, 5, -1, -1, 6, -1, -1};
        BT bt = new BT();
        Node root = bt.builtTree(nodes);
        System.out.println(root.left.data);
    }

    
}
