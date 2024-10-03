package Recursion;

public class SubString {
    public static void subString(String str, int start){
        if(start == str.length()){
            return;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=start; i<str.length(); i++){
            sb.append(str.charAt(i));
            System.out.println(sb);
        }
        subString(str, start+1);
    }
    public static void main(String args[]){
        subString("abcd", 0);
    }
}
