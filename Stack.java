package DS;

import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		
		int a[]=new int [10];
		StackFunctionality stack = new StackFunctionality();
		Scanner in = new Scanner(System.in);
		int TOP=-1;
		int choice = 0;
		boolean loop=true;
		

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
				if(TOP==(a.length-1)) {
					System.out.println("Stack Full");
				}
				else {
					System.out.println("Enter element to insert ..\n");
					int element=in.nextInt();					
					TOP=stack.push(element, a, TOP);					
				}				
				System.out.println("new top is "+ TOP);
				break;
			
				
			case 2:
				if(TOP==-1) {
					System.out.println("Stack Empty");
				}
				else {					
					TOP=stack.pop(TOP,a);
					//					System.out.println("popped element is "+ a[TOP+1]);
				}				
				System.out.println("new top is "+ TOP);
				break;
			
			case 3:
				for(int i=0;i<a.length;i++) {
					System.out.println(a[i]);
				}
				
				break;
				
				
			case 9:
				loop= false;
				break;
				
			default:
				break;
			
		}
		
		
	}

	}
	
	
}
