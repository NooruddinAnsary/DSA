package Backtracking;

public class Permutations {
    public static void permutation(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);//ab
            //Assume ==> "abcde" = "ab" + "de" (remove c)
            String newstr = str.substring(0, i) + str.substring(i+1);// i not included
            permutation(newstr, ans+curr);
            
        }
    }
    public static void main(String args[]){
        String str = "abc";
        //System.out.println(str.substring(1));
        permutation(str, "");
    }
}
