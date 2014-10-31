package leetcode;

public class insertionSortList {

	public ListNode solution(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode realHead = head;
		ListNode node = head.next;
		ListNode last = head;
		int count = 1;
		while (node != null) {
			ListNode next = node.next;
			ListNode tmp = realHead;
			boolean hasExchange = false;
			for (int i = 0; i < count; i++) {
				if (tmp.val > node.val) {
					last.next = node.next;
					node.next = tmp;
					hasExchange = true;
					if (i == 0) {
						realHead = node;
					}
					break;
				}
				tmp = tmp.next;
			}
			if (!hasExchange) {
				last = node;
			}
			node = next;
			count++;
		}
		return realHead;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		ListNode[] nodes = new ListNode[16];
		ListNode head = new ListNode(16);
		nodes[0] = head;
		for (int i = 1; i < 16; i++) {
			ListNode node = new ListNode(i);
			nodes[i] = node;
			nodes[i - 1].next = node;
		}
		insertionSortList solution = new insertionSortList();
		ListNode output = solution.solution(head);
		while (output != null) {
			System.out.print(output.val + ",");
			output = output.next;
		}
	}
}
