package SearchInsertPosition35;

public class Solution {
	public int searchInsert(int[] nums, int target) {

		if (nums == null || nums.length == 0)
			return 0;
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			} else {
				if (nums[i] >= target) {
					break;
				}

			}
		}

		return index;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6 };
		int target = 7;
		System.out.println(new Solution().searchInsert(nums, target));
	}
}
