package JAVA;

public class DecToBin {
    public static void binNum(int dec){
        int bin =0;
        int pow=0;
        while(dec>0){
            int rem= dec%2;
            bin +=rem*(int)Math.pow(10, pow);
            dec/=2; 
            pow++;
        }
        System.out.println(bin);
    }
    public static void main(String args[]){
        int n=6;
         binNum(n);
    }
}
