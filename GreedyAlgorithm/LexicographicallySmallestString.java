package GreedyAlgorithm;

public class LexicographicallySmallestString {
    public static String smallestString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int seat = n; //3
        int sum = k; //56
    
        while (seat > 0) {
            int maxValue = (seat - 1) * 26;
            if (sum - 1 <= maxValue) {
                sb.append('a');
                sum -= 1;
            } else {
                int pos = sum - maxValue;
                sb.append((char) (pos - 1 + 'a'));
                sum -= pos;
            }
            seat--;
        }
    
        return sb.toString();
    }
    


    // 2nd way but "LTE PROBLEM"
    public static String myStr(int n, int k){
        String str ="";
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 26; j++) {
                
                if(isSafe(i,j,n,k)){
                    k=k-(j+1);
                    int num = (j+97);
                    char ch  = (char)num;
                   str+= ch;
                   break;
                   
                }
            }
        }
        return str;
    }
    public static boolean isSafe(int i, int j, int n, int k){
        int sum  = k-(j+1);
        boolean res;
        int seat = n-(i+1);
        res = (sum <=(26*seat));
        
        return res;
    }
    public static void main(String[] args) {
        int n = 2;
        int k = 27;
        System.out.println("my function");
        System.out.println(myStr(n, k));

        System.out.println("==================");
        System.out.println(smallestString(n, k));

        
        
    }
}
