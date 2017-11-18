package bestTimetoBuyandSellStock121;

public class Solution {
	public int maxProfit(int[] prices) {
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			min = Math.min(min,prices[i]);
			max= Math.max(max,prices[i]-min);
		}

		return max;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {3,4,5,7,2};
		System.out.println(s.maxProfit(nums));
	}
}
//{3,4,5,7,2}
/*
min = 3 max = 0
min=3 max = 1
min = 3 max= 2;
min = 3  max = 4;
min = 2  max  = 2-2
*/