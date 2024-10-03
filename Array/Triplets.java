package Array;

public class Triplets {
    public static void getTriplet(int num[]){
        int len = num.length;
        for(int i = 0; i<len; i++){
            for(int j = i+1; j<len; i++){
                for(int k = j+1; k<len; k++){
                    if(num[i] + num[j] + num[k] == 0){
                        System.out.println(num[i]+", "+num[j]+", "+num[k]);
                    }
                }
            }
        }
    } 
    public static void main(String[] args) {
        int num[] = {-1, 0, 1, 4, 2, -1, -4};
        getTriplet(num);   
    }
}
