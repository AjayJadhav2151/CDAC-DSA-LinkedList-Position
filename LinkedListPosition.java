package linkedListPosition;

import java.util.Scanner;

import linkedList.Node;

public class LinkedListPosition {

	private Node head;

	public LinkedListPosition() {
		head = null;
	}

	public void setHead(Node newnode) {
		this.head = newnode;
	}

	Scanner sc = new Scanner(System.in);

	public Node createNewNode() {
		Node newnode = new Node();
		System.out.println("Enter Data value:");
		newnode.setData(sc.nextInt());
		newnode.setNext(null);
		return newnode;
	}

	public void AddPosition(int pos) {
		Node newnode = createNewNode();

		if (pos == 1) 
		{
			if (head == null) {
				head = newnode;
			} else {
				newnode.setNext(head);
				head = newnode;
			}
			System.out.println("Node Added.....");
		} 
		else if (pos == (getCount() + 1)) 
		{

			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newnode);
			System.out.println("Node Added.....");
		} 
		else if (pos > 1 && pos < (getCount() + 1)) 
		{
			Node temp = head;
			for (int i = 1; i < pos - 1; i++) {
				temp = temp.getNext();
			}
			newnode.setNext(temp.getNext());
			temp.setNext(newnode);
			System.out.println("Node Added.....");
		} 
		else 
		{
			System.out.println("Position Not exits........");
		}
	}

	public void deletebyposition(int pos) {
		if (pos == 1) {
			Node temp = null;
			if (head == null) {
				System.out.println("\n\nLinkedList is Empty.....");
			} else {
				temp = head;
				head = head.getNext();
				temp.setNext(null);
				System.out.println("node is deleted");
			}
		} 
		else if (pos == getCount()) 
		{
			Node temp = head;
				for (int i = 1; i < pos - 1; i++) {
					temp = temp.getNext();
				}
				temp.setNext(null);
				System.out.println("node is deleted");
		} 
		else if (pos > 1 && pos < getCount()) 
		{
			Node temp = head;
			Node tag = temp;
				for (int i = 1; i < pos - 1; i++) {
					tag = temp;
					temp = temp.getNext();
				}
				if (temp != null) {
					tag.setNext(temp.getNext());
					temp.setNext(null);
				}
				System.out.println("node is deleted");
		}
		else {
			System.out.println("Position is not exits ");
		}
	}

	public int getCount() {
		int count = 0;
		if (head == null) {
			return count;
		} else {
			Node temp = head;
			while (temp != null) {
				count++;
				temp = temp.getNext();
			}
		}
		return count;
	}

	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("\n\nLinkedList is Empty.....");
		} else {
			while (temp != null) {
				System.out.print(temp.getData() + "->");
				temp = temp.getNext();
			}
			System.out.println("null");
		}
	}
}
