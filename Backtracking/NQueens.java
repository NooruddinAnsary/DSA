package Backtracking;

public class NQueens {
    static int count = 0;
    public static Boolean isSafe(char board[][], int row, int col){
        //vertical up
        for (int i = row-1; i >= 0; i--) {
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // left up diag
        for (int i = row-1, j = col-1;i >=0 && j>=0; i--, j--) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // right up diag
        for (int i = row-1, j = col+1; i>=0 && j<board.length ; i--, j++) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }

    //===================== "for all possible solution" ==================

    // public static void nQueens(char board[][], int row){
    //     if(row==board.length){
    //         count++;
    //         printBoard(board);
    //         return; 
    //     }
    //     for (int j = 0; j < board.length; j++) {
    //         if(isSafe(board, row, j)){

    //             board[row][j]='Q';
    //             nQueens(board, row+1);
    //          
    //             board[row][j]='x';//after backtracking will do clear the place
    //         }
            
    //     }


    //===================== "for 1 possible solution" ==================

    public static Boolean nQueens(char board[][], int row){ 
        if(row==board.length){
            count++;
            return true; 
        }
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)){

                board[row][j]='Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j]='x';//after backtracking will do clear the place
            }
            
        }
        return false;
        
    }
    public static void printBoard(char board[][]){
        System.out.println("-------chess board----");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
                
            }
            System.out.println();
        }
    }
public static void main(String args[]){
    
    int n = 4;
    char board[][] = new char[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            board[i][j]='x';
        }
        
    }
    if(nQueens(board,0)==true){
        System.out.println("possible");
        printBoard(board);
    }
    System.out.println("count = "+count);
}
    
}
