class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices == null || prices.length <= 1)
        return 0;

        int sell=0, prev_sell=0, buy=Integer.MIN_VALUE, prev_buy;

        for (int i = 0; i < prices.length; ++i) {
            prev_buy = buy;
            buy = Math.max(prev_sell - prices[i], prev_buy);
            prev_sell = sell;
            sell = Math.max(prev_buy + prices[i], prev_sell);
        }
        
        return sell;
    }
}
