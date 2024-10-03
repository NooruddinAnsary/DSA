package Backtracking;

public class SudokuSolver {
    public static Boolean isSafe(int sudoku[][], int row, int col, int digit){
        //column
        for (int i = 0; i <=8; i++) {
            if(sudoku[i][col] == digit){
                return false;
            }
            
        }
        //row
        for (int j = 0; j <=8; j++) {
            if(sudoku[row][j] == digit){
                return false;
            }
            
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        //3x3 grid
        for (int i = sr; i < sr+3; i++) {
            for (int j = sc; j < sc+3; j++) {
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
            
        }
        
        
        return true;
    }

    public static Boolean solver(int sudoku[][], int i, int j){

        if(i==9){
            return true;
        }

        int nextRow = i, nextCol = j+1;
        if(j+1==9){ // outside of a row
            nextRow = i+1;
            nextCol= 0;
        }
        if(sudoku[i][j] !=0){
            return solver(sudoku, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if(isSafe(sudoku, i, j, digit)){
                sudoku[i][j] = digit;
                if(solver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[i][j] = 0;
            }
            
        }
        return false;
    }
    public static void printSudoku(int sudoku[][]){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int[][] sudoku ={ { 7, 0, 0, 0, 0, 0, 2, 0, 0 },   
                            { 4, 0, 2, 0, 0, 0, 0, 0, 3 },   
                            { 0, 0, 0, 2, 0, 1, 0, 0, 0 },   
                            { 3, 0, 0, 1, 8, 0, 0, 9, 7 },   
                            { 0, 0, 9, 0, 7, 0, 6, 0, 0 },   
                            { 6, 5, 0, 0, 3, 2, 0, 0, 1 },   
                            { 0, 0, 0, 4, 0, 9, 0, 0, 0 },   
                            { 5, 0, 0, 0, 0, 0, 1, 0, 6 },   
                            { 0, 0, 6, 0, 0, 0, 0, 0, 8 }   
                        } ;
        if(solver(sudoku, 0, 0)){
            System.out.println("Solution exist");
            printSudoku(sudoku);
        }
        else{
            System.out.println("Solution does not exist");
        }
    }
}
