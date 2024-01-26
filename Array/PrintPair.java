package Array;

public class PrintPair {
    public static void pairArray(int num[]) {
        int len= num.length;
        for(int i=0; i<len; i++){
            for(int j= i+1; j<len; j++){
                System.out.print("("+num[i]+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int num[]={5,1,4,2,6};
        pairArray(num);
    }
}
