package JAVA;

public class HolowRhumbus {
    public static void main(String args[]){
        int n = 10;
        for(int line = 1; line<=n; line++){
            if(line==1 || line==n){
                for(int i=0; i<n-line; i++){
                    System.out.print("  ");
                }
                for(int i=1; i<=n; i++){
                        System.out.print("* ");
                }   
            }
            else{
                for(int i = 0; i<n-line; i++){
                System.out.print("  ");
                }
                System.out.print("* ");
                for(int i = 0; i<n-2; i++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            
            
            System.out.println();
        }
    }

}
