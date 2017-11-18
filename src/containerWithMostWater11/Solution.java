package containerWithMostWater11;

public class Solution {
	public int maxArea(int[] height) {
		if (height == null || height.length == 0)
			return 0;

		int max = 0;
		int front = 0;
		int last = height.length - 1;

		while (front < last) {

			int area = (last - front) * Math.min(height[last], height[front]);

			max = Math.max(max, area);

			if (height[front] < height[last]) {
				front++;
			}else {
				last--;
			}
		}

		return max;
	}
}
