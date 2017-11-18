package validPalindrome;

public class Solution1 {
	public boolean isPalindrome(String s) {
		String reg = "[\\W]";
		s = s.replaceAll(reg, "");
		s = s.trim();
		s = s.toLowerCase();
		System.out.println(s);
		if (s.length() == 0 || s.length() == 1 || s == null)
			return true;
		char[] arr = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;
		while (arr[start] == arr[end]) {

			start++;
			end--;
			if (start >= end) {
				return true;
			}

		}

		return false;
	}

	public static void main(String[] args) {
		Solution1 s1 = new Solution1();
		String a = "A man, a plan, a canal: Panama";
		String b = "Selim's tiredno wonderit's miles.";
		System.out.println(s1.isPalindrome(b));
	}
}
