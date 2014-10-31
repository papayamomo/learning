package leetcode;

import java.util.ArrayList;
import java.util.List;

public class isSymmetricWRONG {

	static public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSym(TreeNode root) {
		if (root == null)
			return true;
		boolean output = true;
		List<Integer> inorder = new ArrayList<Integer>();
		traversal(inorder, root);
		output = calIsSym(inorder);
		return output;
	}

	private boolean calIsSym(List<Integer> list) {
		if (list.size() % 2 == 0) {
			return false;
		}
		boolean output = true;
		for (int i = 0; i < list.size() / 2; i++) {
			if (list.get(i) != list.get(list.size() - 1 - i)) {
				output = false;
				break;
			}
		}
		return output;
	}

	public void traversal(List<Integer> list, TreeNode node) {
		if (node != null) {
			if (node.left != null) {
				traversal(list, node.left);
			}
			list.add(node.val);
			if (node.right != null) {
				traversal(list, node.right);
			}
		}
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		isSymmetricWRONG solution = new isSymmetricWRONG();
		System.out.println(solution.isSym(node1));
	}
}
