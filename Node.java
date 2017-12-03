package singlyLinkedList;

public class Node {
	
	int element;
	Node next;
	
	
	
	public Node(int element, Node next) {
		super();
		this.element = element;
		this.next = next;
	}
	public int getElement() {
		return element;
	}
	public void setElement(int element) {
		this.element = element;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

}
