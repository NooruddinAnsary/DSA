package JAVA;

public class DimondPattern {
    public static void main(String args[]){
        int n = 4;
        int spc=n-1;
        int st=1;
        for(int i = 1; i<=2*n-1; i++){
            for(int sp = 0; sp<spc; sp++){
                System.out.print("  ");
            }
            for(int j = 0; j<st; j++){
                System.out.print("* ");
            }
            if(i<n){
                st = st + 2;
                spc--;
            }
            else{
                st -=2;
                spc++;
            }
            System.out.println();
        }

    }
    
}
