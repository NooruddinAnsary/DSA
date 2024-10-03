package Strings;

public class ShortestPath {
    public static float getShortestPath(String path){
        int x = 0;
        int y = 0;
        int len = path.length();
        for (int i = 0; i < len; i++) {
            char ch = path.charAt(i);
            if (ch == 'N') {
                y++;
            } 
            else if(ch == 'S'){
                y--;
            }
            else if (ch == 'E') {
                x++;
            }
            else if(ch == 'W'){
                x--;
            }
        }

        float sort = (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return sort;
    }
    public static void main(String args[]){
        String path = "NES";  //"WNEENESENNN";
        System.out.println(getShortestPath(path)); 
    }
}
