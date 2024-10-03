package Backtracking;

public class KeypadCombination{
    final static char keypad[][] = {{' '},
                            {'.'},
                            {'a','b','c'},
                            {'d','e','f'},
                            {'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

    public static void combinatin(String str, int index, String output){
        int len = str.length();
        if(index == len){
            System.out.println(output);
            return;
        }
        char curr = str.charAt(index);
        char map[] = keypad[curr-'0'];
        for (int i = 0; i < map.length; i++) {
            
            combinatin(str, index+1, output+map[i]);
        }
    }
   
    public static void main(String[] args) {
    combinatin("456", 0, "");
}
    
}
