package twoSumII167;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int sum = nums[left]+nums[right];
			if(sum==target) {
				ans[0] = left+1;
				ans[1] = right+1;
				break;
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
			
			
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 4 };
		int target = 6;

		int[] a = new Solution().twoSum(nums, target);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
