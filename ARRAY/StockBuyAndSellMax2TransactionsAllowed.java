// In daily share trading, a buyer buys shares in the morning and sells them on the same day. If the trader is allowed to make at most 2 transactions in a day, the second transaction can only start after the first one is complete (buy->sell->buy->sell). The stock prices throughout the day are represented in the form of an array of prices. Given an array price of size n, find out the maximum profit that a share trader could have made.

public class StockBuyAndSellMax2TransactionsAllowed {

    public static int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int buy1 = -prices[0];
        int sell1 = 0;
        int buy2 = -prices[0];
        int sell2 = 0;
        for (int i = 1; i < prices.length; i++) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }

    public static void main(String[] args) {
        int[] prices = { 2, 30, 15, 10, 8, 25, 80 };
        System.out.println(maxProfit(prices));
    }
}

// The time complexity of this code is O(n) as it iterates through the
// `prices` array once, and the space complexity is O(1) as it uses only a
// few variables.