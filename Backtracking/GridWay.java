package Backtracking;

public class GridWay {
    public static int maze(int i,  int j, int m,  int n){
        if(j==m-1 || i == n-1){
            return 1;
        }
        else if( i == n || j==m){
            return 0;
        }
        int rightWay = maze(i, j+1, m, n);
        int downWay = maze(i+1, j, m, n);
        return rightWay + downWay;
    }
    public static void main(String args[]){
        System.out.println("way = "+maze(0, 0, 3, 3)); 

    }
}
