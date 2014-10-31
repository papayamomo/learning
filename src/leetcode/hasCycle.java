package leetcode;

public class hasCycle {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean solution(ListNode head) {
		if (head == null) {
			return false;
		}
		if (head.next == head) {
			return true;
		}

		ListNode slow = head;
		ListNode fast = head;
		boolean hasInter = false;

		while (true) {
			if (slow == null || fast == null || fast.next == null)
				break;

			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				hasInter = true;
				break;
			}

		}

		return hasInter;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);

		node1.next = node1;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node5;

		hasCycle solution = new hasCycle();
		System.out.println(solution.solution(node1));

	}
}
