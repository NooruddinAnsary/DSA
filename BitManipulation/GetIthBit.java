package BitManipulation;

public class GetIthBit {
    public static int getIthBit(int n, int pos){
        int bitMask = 1<<pos;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
           return 1; 
        }
        
    }
    public static void main(String args[]){
        int n= 3;
        int pos =0;
        System.out.println(getIthBit(n, pos));
    }
}
