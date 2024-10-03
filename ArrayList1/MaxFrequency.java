package ArrayList1;

import java.util.*;
public class MaxFrequency {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(100);
     
        int[] map = new int[1000];
        int key = 2;
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i) == key){
                
                map[list.get(i+1)]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans=0;
        for (int i = 0; i < 1000; i++) {
            if(map[i]>max){
                max = map[i];
                ans=i;
            }
        }
        System.out.println(ans);

    }
}
