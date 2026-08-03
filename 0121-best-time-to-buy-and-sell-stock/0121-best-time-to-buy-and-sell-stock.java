class Solution {
    public int maxProfit(int[] prices) {
        int buyStock = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < buyStock) {
                buyStock = prices[i];
            }else {
                int diff = prices[i] - buyStock;
                if(diff > profit) {
                    profit = diff;
                }
            }
        }

        return profit;
    }
}