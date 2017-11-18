package maximumSubarray53;

public class Solution {
	public int maxSubArray(int[] nums) {
		int[] sum = new int[nums.length];
		int max = nums[0];
		sum[0] = nums[0];

		for (int i = 1; i < sum.length; i++) {
			sum[i] = Math.max(nums[i], nums[i] + sum[i - 1]);
			max = Math.max(max, sum[i]);

		}

		return max;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {2,3,-1,2,4};
		System.out.println(s.maxSubArray(nums));
	}
	
}
