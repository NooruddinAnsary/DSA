package Array;

public class CountDuplicateNo {
    public static void Count(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 8) {
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[][] matrix = { {4,7,8},{8,8,7} };
        Count(matrix);
    }
}
