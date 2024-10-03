package BST;
import java.util.*;
public class Mearge2BSTs {
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
    static Node createBST(ArrayList<Integer> list, int st, int end) {
        if (st>end) {
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(list.get(mid));
        root.left = createBST(list, st, mid-1);
        root.right = createBST(list, mid+1, end);
        return root;
    }
    
    static void getInorder(Node root, ArrayList<Integer> list){
        if (root == null) {
            return;
        }
        
        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
    }
    static Node mergeBST(Node root1, Node root2){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        getInorder(root1, list);
        getInorder(root2, list2);
        list.addAll(list2);
        Collections.sort(list);

        return createBST(list, 0, list.size()-1);
    }
 
    static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
       
        Node root = mergeBST(root1, root2);
        preOrder(root);

    }
}

