package Array;

public class MaxSubarrayKadanes {
    // public static void allMinusKadanes(int num[]) {
    //     int ms = Integer.MIN_VALUE;
    //     int cs = 0;
    //     for(int i=0; i<num.length; i++){  // i have to show this method
    //         cs += num[i];
    //         ms = Math.max(cs,ms); 
    //     }
    //     System.out.println(ms);
    // }
    public static void kadanes(int num[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<num.length; i++){
            cs += num[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println(ms);
        
    }
    public static void main(String[] args) {
        int num[]={-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(num);
        //int num[]={-4,-2,-6,-9,-8};
        //allMinusKadanes(num);
        
    }
}
