// nCr = n!/r!(n-r)!

package JAVA;

public class BinomialCoefficient {
    public static int fact(int n){
        int f=1;
        for(int i = 1; i<=n; i++){
            f *= i;
        }
        return f;
    }
    public static int binoCoeff(int n, int  r){
        int nFact = fact(n);
        int rFact = fact(r);
        int nmrFact = fact(n-r);
        int binC = nFact/(rFact*nmrFact);
        return binC ;
    }
    public static void main(String args[]){
        System.out.println(binoCoeff(5, 2));
    }
}
