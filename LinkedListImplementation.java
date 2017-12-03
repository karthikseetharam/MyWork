package singlyLinkedList;

public class LinkedListImplementation {

	
	public Node pushNode(int n, Node Top) {
				
		if(Top==null) {		
			Node newNode =new Node(n,Top);
			Top=newNode;
		}
		else {		
			Node newNode =new Node(n,Top);
			Top=newNode;
		}
		return Top;
		
	}
	
	public Node popNode(Node Top) {
		
		Top=Top.getNext();		
		
		return Top;
		
	}
}
