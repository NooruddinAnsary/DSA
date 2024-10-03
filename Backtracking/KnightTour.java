
package Backtracking;

public class KnightTour {
        

    public static void findPath(int i,  int j, int N, int[][] matrix, int move){
        if( i<0 || j<0 || i>=N || j>=N){
            return;
        }
        if(matrix[i][j] !=0){
            return;
        }
    
        matrix[i][j]= move;
        if(move==N*N-1){
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < N; y++) {
                    System.out.print(matrix[x][y]+" ");
                }
                System.out.println();
            }
            return;

        }
        findPath(i-2, j+1, N, matrix, move+1);
        findPath(i-1, j+2, N, matrix, move+1);
        findPath(i+1, j+2, N, matrix, move+1);
        findPath(i+2, j+1, N, matrix, move+1);
        findPath(i+2, j-1, N, matrix, move+1);
        findPath(i+1, j-2, N, matrix, move+1);
        findPath(i-1, j-2, N, matrix, move+1);
        findPath(i-2, j-1, N, matrix, move+1);
        
        
        matrix[i][j] = 0;
    }
    public static void main(String args[]){
        int N= 8;
        
        findPath(0, 0, N, new int[N][N], 0);
        

    }
}
