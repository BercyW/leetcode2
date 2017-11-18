package bestTimetoBuyandSellStockII122;

public class Solution {
	public int maxProfit(int[] prices) {
		int total = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				int profit = prices[i] - prices[i - 1];
				total += profit;
			}
		}
		return total;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] prices = {3,9,10,11};
		System.out.println(s.maxProfit(prices));
	}
}
