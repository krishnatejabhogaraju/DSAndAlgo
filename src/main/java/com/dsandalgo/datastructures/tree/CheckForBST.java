package com.dsandalgo.datastructures.tree;

public class CheckForBST {

	class Node {
		Node left, right;
		int key;

		Node(int item) {
			key = item;
			left = right = null;
		}
	}

	public boolean checkForBST(Node root) {

		if (root != null) {

			if (root.left != null && root.key < root.left.key) {
				return false;
			}

			if (root.right != null && root.key > root.right.key) {
				return false;
			}

			checkForBST(root.left);
			checkForBST(root.right);
		}

		return true;
	}

}
