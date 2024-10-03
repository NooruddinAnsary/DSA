package ArrayList1;

import java.util.ArrayList;

public class ContainerMostWater {

    //Brutforce Approach
    public static void storeWater(ArrayList<Integer> height) {
        
        int maxWater = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht*width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        System.out.println("1st Approach "+maxWater);
        
    }

    // 2 Pointer Approach
    public static void storeWater2(ArrayList<Integer> height) {
        int len = height.size();
        int rp = len-1;
        int lp = 0;
        int maxWater =0;
        while(lp<rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int wd = rp-lp;
            int currWater = ht*wd;
            maxWater = Math.max(maxWater, currWater);
            if(lp<rp){
                lp++;
            }
            else{
                rp--;
            }
        }
        System.out.println("2nd Approach "+maxWater);
    }
    
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        storeWater(height);
        storeWater2(height);
    }
        
}
