package Array; 

public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        int len = matrix.length;
        for(int i=0; i<len; i++){
            //pd
            sum += matrix[i][i];

            //sd
            int j = len-1-i;
            if(i!=j){
                sum +=matrix[i][j];
            }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        int matrix1[][] = {{0,1,2},{3,4,5},{6,7,8}};
        
        System.out.println("sum = "+diagonalSum(matrix));
        System.out.println("sum1 = "+diagonalSum(matrix1));
    }
}
