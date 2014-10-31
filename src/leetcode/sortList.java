package leetcode;

public class sortList {

	public ListNode solution(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode[] tmpHeads = new ListNode[16];

		ListNode next = head;
		int headsPosition = 1;
		while (next != null) {
			ListNode tmp = next.next;
			next.next = null;
			if (tmpHeads[0] == null) {
				tmpHeads[0] = next;
			} else {
				tmpHeads[0] = sort(tmpHeads[0], next);
				for (int i = 0; i < headsPosition; i++) {
					if (tmpHeads[i + 1] == null) {
						tmpHeads[i + 1] = tmpHeads[i];
						tmpHeads[i] = null;
						break;
					} else {
						tmpHeads[i + 1] = sort(tmpHeads[i], tmpHeads[i + 1]);
						tmpHeads[i] = null;
						if (i + 1 >= headsPosition) {
							headsPosition++;
						}
					}
				}
			}
			next = tmp;
		}

		for (int i = 0; i < headsPosition; i++) {
			tmpHeads[i + 1] = sort(tmpHeads[i], tmpHeads[i + 1]);
		}
		head = tmpHeads[headsPosition];

		return head;
	}

	private ListNode sort(ListNode first, ListNode second) {
		if (first == null)
			return second;
		if (second == null)
			return first;

		ListNode tmp = null;
		ListNode head = null;
		ListNode p1 = first;
		ListNode p2 = second;
		while (p1 != null && p2 != null) {
			if (p1.val < p2.val) {
				if (tmp == null) {
					tmp = p1;
					head = tmp;
				} else {
					tmp.next = p1;
					tmp = tmp.next;
				}
				p1 = p1.next;
			} else {
				if (tmp == null) {
					tmp = p2;
					head = tmp;
				} else {
					tmp.next = p2;
					tmp = tmp.next;
				}
				p2 = p2.next;
			}
		}
		if (p1 != null) {
			tmp.next = p1;
		} else {
			tmp.next = p2;
		}
		return head;
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
		sortList solution = new sortList();
		ListNode output = solution.solution(head);
		while (output != null) {
			System.out.print(output.val + ",");
			output = output.next;
		}
	}
}
