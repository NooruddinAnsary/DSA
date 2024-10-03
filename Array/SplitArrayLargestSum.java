package Array;

public class SplitArrayLargestSum {
    static int largestSum(int arr[], int k){
        int len = arr.length;
        int sum=0;
        int max=0;
        for(int var: arr){
            sum+=var;
            max= Math.max(var, max);
        }
        
        if(len==k){
            return max;
        }
        int lo = max;
        int hi = sum;
       
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if (isPossible(arr, mid, k) == true) {
                ans = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }

        return ans;
    }
    static boolean isPossible(int[] arr, int mid, int k){
        int sa = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum > mid){
                sa++;
                sum = arr[i];
            }
        }
        return sa <= k;
    }
    public static void main(String[] args) {
        int arr[]= {7,2,5,10,8};
        int k = 2;
        System.out.println(largestSum(arr, k));
        
    }
}
