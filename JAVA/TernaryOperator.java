package JAVA;

public class TernaryOperator {
    public static void main(String args[]){
        int a = 7;
        int b = 10;
        int c = 10;
        String largest = (a>b?(a>c?"a":"c"):b>c?"b":"c");
        System.out.println(largest);
    }
}
