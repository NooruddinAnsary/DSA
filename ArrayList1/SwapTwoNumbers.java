package ArrayList1;

import java.util.ArrayList;

public class SwapTwoNumbers {
    public static void swap(ArrayList<Integer> list, int index1, int index2){
        
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(3);
        list.add(12);
        System.out.println(list);
        swap(list, 1, 4);
        System.out.println(list);
    }
}
