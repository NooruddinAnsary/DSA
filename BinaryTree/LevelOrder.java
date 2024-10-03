package BinaryTree;

import java.util.*;

public class LevelOrder {
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
    static class LevelTree extends BT{
        public void levelOrder(Node root) {
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node curNode = q.remove();
                if (curNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(curNode.data+" ");
                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }
                }
            }
             
        }
    }
    public static void main(String[] args) {
        int nodes[] ={1, 2, 4, -1, -1, 5, -1, -1, 3,  -1, 6, -1, -1};
        LevelTree bt = new LevelTree();
        Node root = bt.builtTree(nodes);
        bt.levelOrder(root);
    }
    
}
