package validPalindrome;

public class Solution {
	public boolean isPalindrome(String s) {
		if (s == null)
			return true;
		int head = 0;
		int tail = s.length() - 1;
		char cHead, cTail;
		s = s.toUpperCase();
		System.out.println(s);
		while (head <= tail) {
			cHead = s.charAt(head);
			cTail = s.charAt(tail);

			if (!Character.isLetterOrDigit(cHead)) {
				head++;
			}else if (!Character.isLetterOrDigit(cTail)) {
				tail--;
			} else {
				if (cHead!=cTail) {
					return false;
				}
				head++;
				tail--;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		String s1 = "A man, a plan, a canal: Panama";
		System.out.println(s.isPalindrome(s1));
	}
}
