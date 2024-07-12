package Questions;

class Node {
	private int data;
	private Node next;

	public Node() {
		this.data = 0;
		this.next = null;
	}

	public Node(int d, Node n) {
		this.data = d;
		this.next = n;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

class LinkedList {
	private int size;
	private Node start;

	public LinkedList() {

	}

	public boolean isEmpty() {
		if (start == null)
			return true;
		else
			return false;
	}

	public int size() {
		return size;
	}

	public void viewList() {
		if (isEmpty()) {
			System.out.println("List is empty");
		} else {
			Node t = start;
			for (int i = 0; i < size; i++) {
				System.out.print(" " + t.getData());
			}
		}
	}
}

public class LinkedListEx {
	public static void main(String[] args) {

	}
}
