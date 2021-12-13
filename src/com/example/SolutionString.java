package com.example;

public class SolutionString {

	public static void main(String[] args) {

	}

	public static boolean isSymmetric(TreeNode root) {

		if (root == null) {
			return true;
		}
		return checkSymmetric(root.left, root.right);
	}

	public static boolean checkSymmetric(TreeNode a, TreeNode b) {

		if (a == null && b == null) {
			return true;
		}

		if (a == null || b == null) {
			return true;
		}

		if (a.val != b.val) {
			return false;
		}

		return (checkSymmetric(a.left, b.right) && checkSymmetric(b.left, a.right));

	}

	private int level(TreeNode left, TreeNode right) {

		
			if (left == null && right == null) {
				return 0;
			}

		return 1;
	}

}

