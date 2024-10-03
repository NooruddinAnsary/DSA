package ArrayList1;

import java.util.*;

public class PairSumOrder1 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        

        int len = list.size();
        int rp = len-1;
        int lp = 0;
        int target = 19;

        while (lp<rp) {
            int sum = list.get(lp) + list.get(rp);
            if(sum==target){
                System.out.println(list.get(lp)+" + "+list.get(rp)+" = "+ target);
            }
            if(sum<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        
    }
}
