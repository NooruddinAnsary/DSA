package BinaryTree;

import java.util.HashMap;

public class FindDuplicates {
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

    static HashMap<String, Integer> map;

    static String duplicateSubtree(Node root) {
        if (root == null) {
            return "";
        }

        String str = "(";
        str += duplicateSubtree(root.left);
        str += Integer.toString(root.data);
        str += duplicateSubtree(root.right);
        str += ")";

        if (map.get(str) != null && map.get(str) == 1)
            System.out.print(root.data + " ");

        if (map.containsKey(str)) {
            map.put(str, map.get(str) + 1);
        } else {
            map.put(str, 1);
        }
        return str;
    }

    static void printAllDups(Node root) {
        map = new HashMap<>();
        duplicateSubtree(root);
    }

    public static void main(String args[]) {
        
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(2);
        root.right.left.left = new Node(4);
        root.right.right = new Node(4);
        printAllDups(root);
    }
}
