package linkedListCycleII142;

public class Solution {
	public ListNode detectCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow) {
				ListNode start = head;
				while (start != slow) {
					slow = slow.next;
					start = start.next;
				}
				return slow;
			}
		}

		return null;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode head = new ListNode(1);
		// ListNode head1 = new ListNode(2);
		head.next = null;
		// head1.next = null;
		System.out.println(s.detectCycle(head));
	}
}
