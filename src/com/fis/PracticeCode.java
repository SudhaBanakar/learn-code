package com.fis;

public class PracticeCode {
	public static void main(String[] args) throws Exception {
		// Your code here!
		LinkedList list = new LinkedList();
		list.add(-1);
		list.add(1);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(-1);
		list.add(0);
		list.printList(list);
		System.out.println(" ");
		sortLinkedList(list);
	}

	private static void sortLinkedList(LinkedList list) {
		int arr[] = { 0, 0, 0 };
		Node temp = list.head;
		while (temp != null) {
			if (temp.data < 0) {
				arr[0]++;
			} else {
				arr[++temp.data]++;
			}
			temp = temp.next;
		}
		// resetting the temp to head
		temp = list.head;
		int i = 0;
		int k = -1;
		// print list in sorted
		while (temp != null) {
			if (arr[i] == 0) {
				k = i;
				i++;
			} else {
				temp.data = k;
				arr[i]--;
				temp = temp.next;
			}
		}
		list.printList(list);
		
	}
}

class LinkedList {
	Node head;

	public void add(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	public void printList(LinkedList list) {
		Node curr = list.head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}