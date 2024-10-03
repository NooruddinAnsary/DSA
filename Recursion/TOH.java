package Recursion;

public class TOH {
    public static void toh(int n, String source, String helper, String destination){
        if(n==1){
            System.out.println("Move "+n+"th disk from "+source+" to "+destination);
            return;
        }
        toh(n-1, source, destination, helper);// move source to helper using destination(as helper)
        System.out.println("Move "+n+"th disk from "+source+" to "+destination);
        toh(n-1, helper, source, destination ); // move helper to destination using source(as helper)
    }
    public static void main(String args[]){
        toh(3, "source", "helper", "destination");
    }
}
