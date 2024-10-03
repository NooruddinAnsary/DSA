package Array;

public class ContainDuplicate {
    public static boolean isDuplicate(int num[]) {
        int n = num.length;
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num[] ={1,2,3,4,1};
        System.out.println(isDuplicate(num));

    }
}
