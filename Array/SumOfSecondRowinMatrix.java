package Array;

public class SumOfSecondRowinMatrix {
    public static int sumSRow(int matrix[][]){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[1][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,13},{2,2,3} };
        System.out.println(sumSRow(nums)); 
    }
}
