package Backtracking;

public class RatMaze {
    public static void findPath(int i,  int j, int N, int[][] matrix, Boolean[][] visited, String psf){
        
        if( i<0 || j<0 || i>=N || j>=N){
            return;
        }
        if((matrix[i][j] == 0 )|| (visited[i][j] == true)){
            return;
        }
        if(i==N-1 && j==N-1){
            System.out.println("Reached destination with path "+psf);
            return;

        }
        visited[i][j]=true;

        findPath(i-1, j, N, matrix, visited, psf+"Up ");
        findPath(i+1, j, N, matrix, visited, psf+"Down ");
        findPath(i, j-1, N, matrix, visited, psf+"Left ");
        findPath(i, j+1, N, matrix, visited, psf+"Right ");
        
        visited[i][j]=false;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,1,1,1},{0,1,0,1}, {1,1,1,1},{1,0,1,1}};
        int N = matrix.length;
        Boolean visited[][] = new Boolean[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                visited[i][j]=false;
        findPath(0, 0, N, matrix, visited,"");
        

    }
}

