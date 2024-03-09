// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[] buy = new int[n]; // last trxn was buy
        buy[0] = -prices[0];
        int[] sell = new int[n]; // last trxn was sell

        for (int i = 1; i < n; i++) {
            buy[i] = Math.max(buy[i - 1], sell[i - 1] - prices[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i] - fee);
        }
        return sell[n - 1];
    }
}
