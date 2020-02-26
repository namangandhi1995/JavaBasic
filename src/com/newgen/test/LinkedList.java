package com.newgen.test;

public class LinkedList {

	public static class Node {

		int data;
		Node next;

		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}

	public static void printlist(Node head) {

		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}

	public static Node reverse(Node node) {
		Node newnode;
		if (node == null || node.next == null)
			return node;

		newnode = reverse(node.next);
		node.next.next = node;

		node.next = null;
		return newnode;

	}

	public static void main(String[] args) {
		Node head = new Node(5);
		head.next = new Node(7);
		head.next.next = new Node(8);
		head.next.next.next = new Node(6);
		head.next.next.next.next = new Node(9);
		printlist(head);
		System.out.println();
		head = reverse(head);
		printlist(head);
	}

}
