package Array;

public class SearchSortedMatrix {
    public static boolean staircaseSearch(int matrix[][], int key){
        int col = matrix[0].length-1;
        int row = 0;
        while(row < matrix.length && col >= 0){
            if (matrix[row][col] == key) {
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            if(matrix[row][col] > key){
                col--;
            }
            else if (matrix[row][col] < key){
                row ++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        System.out.println(staircaseSearch(matrix, 15)); 
    }
}
