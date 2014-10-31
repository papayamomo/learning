package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class perorderTraversal {

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
				if (wrapper.isOuputed == false) {
					list.add(current.val);
					wrapper.isOuputed = true;
				}
				wrapper.child++;
				wrapper = new TreeNodeWrapper(current.left);
				stack.push(wrapper);
				current = current.left;
			} else if (wrapper.child == 0 && current.left == null
					&& current.right != null) {
				if (wrapper.isOuputed == false) {
					list.add(current.val);
					wrapper.isOuputed = true;
				}
				wrapper.child += 2;
				wrapper = new TreeNodeWrapper(current.right);
				stack.push(wrapper);
				current = current.right;
			} else if (wrapper.child == 1 && current.right != null) {
				if (wrapper.isOuputed == false) {
					list.add(current.val);
					wrapper.isOuputed = true;
				}
				wrapper.child++;
				wrapper = new TreeNodeWrapper(current.right);
				stack.push(wrapper);
				current = current.right;
			} else {
				if (wrapper.isOuputed == false) {
					list.add(current.val);
					wrapper.isOuputed = true;
				}
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
		boolean isOuputed = false;

		TreeNodeWrapper(TreeNode node) {
			this.node = node;
		}
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;

		perorderTraversal solution = new perorderTraversal();
		List<Integer> list = solution.solution(node1);

		for (Integer num : list) {
			System.out.print(num + " ");
		}

	}
}
