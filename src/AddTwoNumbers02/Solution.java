package AddTwoNumbers02;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode a = l1;
		ListNode b = l2;
		ListNode l3 = new ListNode(0);
		ListNode temp = l3;
		int sum = 0;

		while (a != null || b != null) {
			sum /= 10;

			if (a != null) {
				sum += a.val;
				a = a.next;

			}
			if (b != null) {
				sum += b.val;
				b = b.next;
			}

			temp.next = new ListNode(sum % 10);
			temp = temp.next;
		}
		if (sum / 10 == 1) {
			temp.next = new ListNode(1);
		}
		return l3.next;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		l3.next = null;
		ListNode l4 = new ListNode(5);
		ListNode l5 = new ListNode(6);
		ListNode l6 = new ListNode(4);
		l4.next = l5;
		l5.next = l6;
		l6.next = null;
		ListNode abc = s.addTwoNumbers(l1, l4);
		
		System.out.println(abc.val);
		System.out.println(abc.next.val);
		System.out.println(abc.next.next.val);
		
	}
}
