package leetcode;

public class reverseList {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public void solution(ListNode head) {
		if (head != null && head.next != null) {
			ListNode current = head.next;
			ListNode last = head;
			ListNode after = current.next;
			while (current != null) {
				current.next = head;
				last.next = after;
				head = current;
				current = after;
				if (after != null)
					after = after.next;
			}
		}
	}

	public void print(ListNode head) {
		while (head != null) {
			System.out.print(head.val + ",");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);

		node1.next = node2;
		node2.next = node3;

		reverseList solution = new reverseList();
		solution.solution(node1);
		solution.print(node1);

	}
}
