package linkedListCycle;

public class Solution {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head;

		while (fast!= null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}

		}

		return false;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode  head = new ListNode(1);
		ListNode  head1 = new ListNode(2);
		head.next = head1;
		head1.next = null;
		System.out.println(s.hasCycle(head));
	}
}
