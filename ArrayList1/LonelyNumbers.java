package ArrayList1;

import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumbers {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> result = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(5);
        list.add(5);
        list.add(13);
        list.add(14);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        //list= [3, 4, 5, 5, 7, 13]
        for (int i = 0; i < list.size(); i++) {
                          
            if(i != 0 && (list.get(i-1)==(list.get(i)-1) || list.get(i)== list.get(i-1))){
                // i =1 (i!=0)
                          // (list.get(i-1) => 3) == (list.get(i)-1 => 4-1 = 3) ===>true
                          
                          //i=3
                          // (list.get(i-1) =>5) == (list.get(i) => 5 ) ===> true
                          continue;
                
            }
            if( i != list.size()-1 && (list.get(i+1)==(list.get(i)+1) || list.get(i)== list.get(i+1))){
               
                continue;
            }
            result.add(list.get(i));
            

        }
        for (int i =0; i< result.size(); i++) {
            System.out.print(result.get(i)+" ");
        }
    }
}
