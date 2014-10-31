package leetcode;

public class reorderList {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class ListNodeWrapper {
		ListNode node;
		ListNodeWrapper previous = null;

		ListNodeWrapper(ListNode node) {
			this.node = node;
		}
	}

	public void solution(ListNode head) {
		if (head != null && head.next != null) {
			ListNodeWrapper headWrapper = new ListNodeWrapper(head);
			ListNode node = head.next;
			int counter = 1;
			while (node != null) {
				ListNodeWrapper wrapper = new ListNodeWrapper(node);
				wrapper.previous = headWrapper;
				headWrapper = wrapper;
				node = node.next;
				counter++;
			}

			ListNodeWrapper curWrapper = headWrapper;
			ListNode curNode = head;
			boolean odd = true;
			for (int i = 1; i < counter; i++) {
				if (odd) {
					ListNode tmpNode = curNode.next;
					curNode.next = curWrapper.node;
					curWrapper.node.next = null;
					curNode = tmpNode;
					odd = false;
				} else {
					ListNodeWrapper tmpWrapper = curWrapper.previous;
					curWrapper.node.next = curNode;
					if (i == counter - 1)
						curNode.next = null;
					curWrapper = tmpWrapper;
					odd = true;
				}
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
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;

		reorderList solution = new reorderList();
		solution.solution(node1);
		solution.print(node1);

	}
}
