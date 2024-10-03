package Recursion;

public class LengthOfString {
    public static int lengthString(String str){

        if(str== null || str.isEmpty()){
            return 0;
        }
        int count = lengthString(str.substring(1))+1;
        return count;
    }
    public static void main(String[] args) {
        System.out.println(lengthString("abvck"));
    }
}
