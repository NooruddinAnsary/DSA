package AnujDSA;


public class PermutationOfString {
    private static void perm(String str, String permutation) {
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i+1);
            
            perm(newStr, permutation+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        perm(str, "");
    }
}
