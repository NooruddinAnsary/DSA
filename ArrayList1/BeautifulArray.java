package ArrayList1;

import java.util.ArrayList;

public class BeautifulArray {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);

        int n = 6;
     
        while (arr.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            int arrSize = arr.size();
            for (int i = 0; i < arrSize; i++) {
                if(arr.get(i)*2-1 <= n){
                    temp.add(arr.get(i)*2-1);
                }
            }
            for (int j = 0; j < arrSize; j++) {
                if(arr.get(j)*2 <= n){
                    temp.add(arr.get(j)*2);
                }
            }

            arr = temp;
        }
        for (int i =0; i<arr.size(); i++) {
            System.out.println(arr.get(i)); 
        }
    }
    
}
