package Array;

public class TransposeMatrix {
    public static void tranpose(int matrix[][]){
        int row = 2;
        int col = 3;
        int tMatrix[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tMatrix[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < tMatrix.length; i++) {
            for (int j = 0; j < tMatrix[0].length; j++) {
                System.out.print(tMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6}};
        tranpose(matrix);
    }
        
}
