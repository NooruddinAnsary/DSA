package Array;

public class BuySellStock { // T/C --> O(n)
    public static int stocks(int price[]) {
        int n = price.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<n; i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;// today's profit
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        
        System.out.println("Max profit = "+stocks(price));
    }
    
}
