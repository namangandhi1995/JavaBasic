package com.newgen.test;

import java.util.LinkedList;
import java.util.Queue;

public class BinarTree {
	public static void main(String[] args) {

		BinaryTree root = new BinaryTree(1);
		root.left = new BinaryTree(2);
		root.right = new BinaryTree(3);
		root.left.left = new BinaryTree(5);
		printInorder(root);
		insert(root, 4);
		System.out.println("After Insertion");
		printInorder(root);
		System.out.println("After Deletion");
		delete(root, 4);
		printInorder(root);
		System.out.println("After mirror");
		root = mirror(root);
		printInorder(root);
		System.out.println("After zigzag");
		zigzag(root);

	}

	public static BinaryTree mirror(BinaryTree root) {
		// TODO Auto-generated method stub
		if (root == null)
			return null;
		BinaryTree left = mirror(root.left);
		BinaryTree right = mirror(root.right);
		root.left = right;
		root.right = left;
		return root;
	}

	public static void zigzag(BinaryTree Node) {
		int height = height(Node);
		int flag = 0;
		for (int i = 1; i <= height; i++) {

			if (flag == 0) {
				printlefttoright(Node, i);
				flag = 1;
			} else if (flag == 1) {
				printrighttoleft(Node, i);
				flag = 0;
			}
		}

	}

	private static void printrighttoleft(BinaryTree node, int i) {
		// TODO Auto-generated method stub
		if (node == null)
			return;
		if (i == 1)
			System.out.println(node.data);
		else if (i > 1) {
			printlefttoright(node.right, i - 1);
			printlefttoright(node.left, i - 1);
		}

	}

	private static void printlefttoright(BinaryTree node, int i) {
		// TODO Auto-generated method stub
		if (node == null)
			return;
		if (i == 1)
			System.out.println(node.data);
		else if (i > 1) {
			printlefttoright(node.left, i - 1);
			printlefttoright(node.right, i - 1);
		}

	}

	private static int height(BinaryTree node) {
		// TODO Auto-generated method stub
		if (node == null)
			return 0;

		int lheight = height(node.left);
		int rheight = height(node.right);

		return Integer.compare(lheight + 1, rheight + 1);
	}

	public static void printInorder(BinaryTree Node) {
		// TODO Auto-generated method stub
		if (Node == null)
			return;
		else {
			printInorder(Node.left);
			System.out.println(Node.data);
			printInorder(Node.right);

		}
	}

	public static BinaryTree delete(BinaryTree Node, int data) {
		// TODO Auto-generated method stub

		if (Node == null)
			return null;

		if (Node.left == null && Node.right == null) {
			if (Node.data == data) {
				return null;
			} else {
				return Node;
			}
		}

		Queue<BinaryTree> q = new LinkedList<BinaryTree>();
		q.add(Node);
		BinaryTree temp1 = null;
		BinaryTree temp = null;
		while (!q.isEmpty()) {
			temp = q.poll(); //poll doesnot through nullpointerexception

			if (temp.data == data) {
				temp1 = temp;
			}
			if (temp.left != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}

		}
		if (temp1 != null) {
			int x = temp.data;
			deletion(Node, temp);
			temp1.data = x;
		}
		return Node;
	}

	private static void deletion(BinaryTree temp, BinaryTree temp1) {
		// TODO Auto-generated method stub
		Queue<BinaryTree> q = new LinkedList<>();
		q.add(temp);
		while (!q.isEmpty()) {
			BinaryTree t = q.poll();

			if (t == temp1) {
				t = null;
				return;
			}
			if (t.right == temp1) {
				t.right = null;
				return;
			} else
				q.add(t.right);
			if (t.left == temp1) {
				t.left = null;
				return;
			} else
				q.add(t.left);
		}

	}

	public static void insert(BinaryTree Node, int data) {
		// TODO Auto-generated method stub

		Queue<BinaryTree> q = new LinkedList<BinaryTree>();
		q.add(Node);

		while (!q.isEmpty()) {
			Node = q.peek();
			q.remove();

			if (Node.left == null) {
				Node.left = new BinaryTree(data);
				break;
			} else {
				q.add(Node.left);
			}

			if (Node.right == null) {
				Node.right = new BinaryTree(data);
				break;
			} else {
				q.add(Node.right);
			}

		}

	}

}

class BinaryTree {

	int data;
	BinaryTree left;
	BinaryTree right;

	public BinaryTree(int data) {
		this.data = data;
		left = right = null;
	}

}