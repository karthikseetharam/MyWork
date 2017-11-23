package DS;

public class StackFunctionality {

	
	public int push(int element, int a[],int top) {				
		top++;		
		a[top]=element;		
		return top;
	}
	
	public int pop(int top,int a[]) {				
		
		
		a[top]=0;	
		top--;
		return top;
	}
}
