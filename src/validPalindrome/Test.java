package validPalindrome;

public class Test {
	public static void main(String[] args) {
		String str = "abc.fab,dfa";
		String reg = "([\\W])";
		String[] arr = str.split(reg);
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
