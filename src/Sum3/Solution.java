package Sum3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length < 3)
			return null;
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		for (int i = 0; i < nums.length - 3; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				int sum = nums[i]+nums[left]+nums[right];
				if(sum==0) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(nums[i]);
					list.add(nums[left]);
					list.add(nums[right]);
					ans.add(list);
				}else {
					
			
					
					
				}
				
				
				
				
				
			}

		}

		return ans;
	}
}
