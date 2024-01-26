package Array;

public class PrintSubarray {
    public static void subarray(int num[]) {
        int len = num.length;
        int large=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {

            for (int j = i; j < len; j++) {

                int sum = 0;
                for (int k = i; k <= j; k++) {

                    sum += num[k];
                    System.out.print(num[k] + " ");
                }
                System.out.println("sum=" + sum);
                if(sum>large){
                    large=sum;
                }
                if(sum<min){
                    min=sum;
                }

            }
            System.out.println();
        }
        System.out.println("Largest= "+large);
        System.out.println("min= "+min);

    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, -9 };
        subarray(num);
    }
}
