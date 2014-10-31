package leetcode;

public class detectCycle {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode solution(ListNode head) {
		if (head == null || (head != null && head.next == head)) {
			return head;
		}

		ListNode slow = head;
		ListNode fast = head;
		ListNode beginPoint = null;
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

		fast = head;
		while (hasInter) {
			if (fast == slow) {
				beginPoint = fast;
				break;
			} else {
				fast = fast.next;
				slow = slow.next;
			}
		}

		return beginPoint;
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

		detectCycle solution = new detectCycle();
		ListNode node = solution.solution(node1);
		System.out.println(node.val);

	}
}
