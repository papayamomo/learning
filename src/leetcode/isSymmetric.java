package leetcode;

public class isSymmetric {

	static public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSym(TreeNode root) {
		return compare(root, root);
	}

	public boolean compare(TreeNode node1, TreeNode node2) {
		if (node1 == null && node2 == null) {
			return true;
		} else if (node1 != null && node2 != null && node1.val == node2.val) {
			return compare(node1.left, node2.right)
					&& compare(node1.right, node2.left);
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		isSymmetric solution = new isSymmetric();
		System.out.println(solution.isSym(node1));
	}
}
