package ArrayList1;

import java.util.ArrayList;

public class PairSumOrderedRotated {
    public static Boolean pair(ArrayList<Integer> list, int target){
        int bp =-1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp = bp+1;
        int rp=bp;
        int len =list.size();
        while (lp != rp) {
            if(list.get(lp) + list.get(rp) == target){
                System.out.println(list.get(lp)+" + "+list.get(rp)+" = "+ target);
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1)%len;
            }
            else{
                rp = (len+rp-1)%len;
            }
        }
        return false;
        
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(16);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        int target = 20;
        System.out.println(pair(list, target));
        

        
        
    }
}
