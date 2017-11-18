package threeSumClosest16;

import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {

		if (nums == null || nums.length < 3) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		int ans = 0;
		Arrays.sort(nums);
		for (int i = 0; i <=nums.length - 3; i++) {
			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (Math.abs(target - sum) < min) {
					min = Math.abs(target - sum);
					ans = sum;
				}
				if(target==sum) {
					
					return ans;
				}else if(target>sum) {
					left++;
				}else {
					right--;
				}

			}

		}

		return ans;
	}
}
