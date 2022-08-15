class Solution {
    public int maxProfit(int[] prices) {
        //iterate through array and check if current value is lower than previous lowest
        //calculate today's profit by subtracting from current day
        //compare to previous largest profit
        //if profit is negative, return 0
        //else return profit
        
        int lowest = Integer.MAX_VALUE;
        int bestprofit = 0;
        
        for(int i = 0; i < prices.length; i++){
            //if current value is lower than previous lowest, replace it
            lowest = Math.min(prices[i], lowest);
            
            //calculate current profit, then compare to best profit so far
            int currentprofit = prices[i] - lowest;
            bestprofit = Math.max(bestprofit, currentprofit);
        }
        return bestprofit;
    }
}