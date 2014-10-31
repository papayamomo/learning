package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postorderTraversal {

	public List<Integer> solution(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();

		if (root == null)
			return list;

		Stack<TreeNodeWrapper> stack = new Stack<TreeNodeWrapper>();

		TreeNode current = root;
		TreeNodeWrapper wrapper = new TreeNodeWrapper(root);
		stack.push(wrapper);

		while (!stack.isEmpty()) {
			if (wrapper.child == 0 && current.left != null) {
				wrapper.child++;
				wrapper = new TreeNodeWrapper(current.left);
				stack.push(wrapper);
				current = current.left;
			} else if (wrapper.child == 0 && current.left == null
					&& current.right != null) {
				wrapper.child += 2;
				wrapper = new TreeNodeWrapper(current.right);
				stack.push(wrapper);
				current = current.right;
			} else if (wrapper.child == 1 && current.right != null) {
				wrapper.child++;
				wrapper = new TreeNodeWrapper(current.right);
				stack.push(wrapper);
				current = current.right;
			} else {
				list.add(current.val);
				stack.pop();
				if (!stack.isEmpty()) {
					wrapper = stack.peek();
					current = wrapper.node;
				}
			}
		}

		return list;
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public class TreeNodeWrapper {
		TreeNode node;
		int child = 0;

		TreeNodeWrapper(TreeNode node) {
			this.node = node;
		}
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		node2.left = node3;
		node1.right = node2;

		postorderTraversal solution = new postorderTraversal();
		List<Integer> list = solution.solution(node1);

		for (Integer num : list) {
			System.out.print(num + " ");
		}

	}
}
