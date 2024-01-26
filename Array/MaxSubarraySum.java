package Array;

public class MaxSubarraySum {
    public static void maxSum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];//[1,2,3,4] -->i=3, prefix[i-1=2]+prefix[i=3]
        }

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {

                currSum = i==0? prefix[j]: prefix[j]-prefix[i-1];
               
                System.out.println("sum=" + currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum = "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={4,2,6,9,8};
        maxSum(numbers);
    }

}
