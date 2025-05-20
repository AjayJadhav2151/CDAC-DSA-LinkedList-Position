package linkedListPosition;

public class Node {
	private int data;
	private Node next;
	
	public Node() {
		this.data=0;
		this.next=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int value) {
		this.data = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node value) {
		this.next = value;
	}
}
