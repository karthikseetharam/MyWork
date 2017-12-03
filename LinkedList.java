package singlyLinkedList;

import java.util.Scanner;

public class LinkedList {

	public static void main(String[] args) {

		Node TOP =null;
		int choice=0;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		LinkedListImplementation li= new LinkedListImplementation();
		
		boolean loop = true;
		while(loop) {
			System.out.println(loop);
			
			System.out.println("Enter 1 for Push");
			System.out.println("Enter 2 for Pop");
			System.out.println("Enter 3 for ViewStack");
			System.out.println("Enter 0 for Exit");
			System.out.println("Enter you Choice...\n");
			
			choice=in.nextInt();
			
			
			switch (choice) {
			case 1:
				System.out.println("Enter Stack Element : ");
				int element = in.nextInt();
				
				TOP=li.pushNode(element, TOP);
				
			break;
			
			case 2:
				if (TOP==null){
					System.out.println("stack empty");
				}else {
				TOP=li.popNode(TOP);
				}
				break;
			
			case 3:
				
				Node parse=TOP;
				do {
					System.out.println(parse.element);
					parse=parse.next;
				}while(parse != null);
				
				break;
			case 0:
				loop= false;
				break;
				
			default:
				break;
				
			}
			
		
		

	}

}
}
