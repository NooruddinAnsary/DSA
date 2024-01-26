package AnujDSA;

class Solution {

    static int matrix[][] = {{1,1,1},{1,0,1},{1,1,1}};
        

        static int m = matrix.length;
        static int n = matrix[0].length;
    public static void main(String[] args) {

        
        for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    markRow(i);
                    markCol(j);
                }
                
            } 
        }
        for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
                System.out.print(matrix[i][j]);
                
            } 
            System.out.println();
        }
        
        
    }
    public static int[][] markCol(int j) {
        for(int i=0; i<m; i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
            
        }
        return matrix;
    }
    public static int[][] markRow(int i) {
        for(int j=0; j<n; j++){
            if(matrix[i][j]!=0){
               matrix[i][j]=-1;
            }
            
        }
        return matrix;
        
    }
}
