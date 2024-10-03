package BinaryTree;

import java.util.ArrayList;

public class LowestCommonAncestor {
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
    static boolean getPath(Node root, int n, ArrayList<Node> list){
        if (root == null) {
            return false;
        }
        list.add(root);
        if (root.data == n) {
            return true;
        }
        boolean lh = getPath(root.left, n, list);
        boolean rh = getPath(root.right, n, list);
       if (rh||lh) {
        return true;
       }
       list.remove(list.size()-1);
       return false;
    }
    static Node lca(Node root, int n1, int n2){
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();
        getPath(root, n1, list1);
        getPath(root, n2, list2);
        int i = 0;
        for (; i < list1.size() && i< list2.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                break;
            }
        }
        Node lca = list1.get(i-1);
        return lca;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4, n2 = 6;
        Node val = lca(root, n1, n2);
        System.out.println(val.data);
    }
}
