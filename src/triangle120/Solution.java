package triangle120;

import java.util.*;

public class Solution {
	public int minimumTotal(List<List<Integer>> triangle) {
		if(triangle.size()==1) return triangle.get(0).get(0);
		int[] dp = new int[triangle.size()];
		for (int i = 0; i < triangle.get(triangle.size() - 1).size(); i++) {
			dp[i] = triangle.get(triangle.size() - 1).get(i);
		}

		for (int i = triangle.size() - 2; i >= 0; i--) {
			for (int j = 0; j < triangle.get(i).size(); j++) {
				dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
			}
		}

		return dp[0];
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list2.add(3);
		list2.add(4);
		triangle.add(list1);
		triangle.add(list2);

		System.out.println(s.minimumTotal(triangle));
	}
}
