package JAVA;

public class BinToDeci {
    public static void binNum(int bin){
        int dec =0;
        int pow=0;
        while(bin>0){
            int rem= bin%10;
            dec +=rem*(int)Math.pow(2, pow);
            bin/=10; 
            pow++;
        }
        System.out.println(dec);
    }
    public static void main(String args[]){
        int n=1001;
         binNum(n);
    }
}
