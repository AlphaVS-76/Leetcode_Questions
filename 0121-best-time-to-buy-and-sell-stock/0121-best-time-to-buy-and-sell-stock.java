class Solution {
    public int maxProfit(int[] prices) {
        int stock = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++){
            if(stock < prices[i] && profit < (prices[i]-stock)){
                profit = prices[i]-stock;
            }
            else if(prices[i] < stock){
                stock = prices[i];
            }
        }

        return profit;
    }
}