package com.dsandalgo.datastructures.tree;

import com.dsandalgo.datastructures.tree.CheckForBST.Node;

public class BinarySearchTreeImplementation {

	class Node {
		Node left, right;
		int key;

		Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	BinarySearchTreeImplementation() {
		root = null;
	}

	BinarySearchTreeImplementation(int item) {
		root = new Node(item);
	}

	void insert(int key) {
		root = insertIntoTree(root, key);
	}

	private Node insertIntoTree(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (root.key > key) {
			root.left = insertIntoTree(root.left, key);
		} else if (root.key < key) {
			root.right = insertIntoTree(root.right, key);
		}

		return root;

	}

	void inOrderTraversal(Node root) {
		inOrder(root);
	}

	private void inOrder(Node root) {

		if (root != null) {

			inOrder(root.left);
			System.out.println(root.key);
			inOrder(root.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTreeImplementation tree = new BinarySearchTreeImplementation();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		tree.root.key = 1;

		tree.inOrderTraversal(tree.root);

	}

}
