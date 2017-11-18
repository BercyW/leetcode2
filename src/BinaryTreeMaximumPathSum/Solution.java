package BinaryTreeMaximumPathSum;

public class Solution {
	public int maxPathSum(TreeNode root) {
		int[] max = new int[1];
		max[0] = Integer.MIN_VALUE;
		findMax(root, max);
		return max[0];
	}

	public int findMax(TreeNode root, int[] max) {
		if (root == null)
			return 0;

		int left = findMax(root.left, max);
		int right = findMax(root.right, max);

		int ans = Math.max(root.val, Math.max(root.val + left, root.val + right));

		max[0] = Math.max(max[0], Math.max(ans, root.val + left + right));

		return ans;
	}
	public static void main(String[] args) {
		Solution s =new Solution();
		TreeNode t1 = new TreeNode(6);
		TreeNode t2 = new TreeNode(5);
		TreeNode t3 = new TreeNode(4);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(2);
		TreeNode t6 = new TreeNode(1);
		TreeNode t7 = new TreeNode(7);
		
		t1.left = t2;
		t1.right = t7;
		t2.left = t4;
		t2.right = t3;
		t4.left = t6;
		t4.right = t5;
		
		System.out.println(s.maxPathSum(t1));
	}
}
