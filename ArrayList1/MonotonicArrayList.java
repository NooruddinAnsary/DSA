package ArrayList1;

import java.util.ArrayList;

public class MonotonicArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        Boolean flag = true;
        Boolean flag1 = true;
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i-1)>list.get(i)){
                flag = false;
            }
            if(list.get(i-1)<list.get(i)){
                flag1 = false;
            }
        }
        if(flag || flag1){
            System.out.println("monotonic");
        }
    }
}
