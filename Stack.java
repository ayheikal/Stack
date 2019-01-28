package data_structuresImplementation;
//last in first out
public class Stack {
	static Node head;
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
		
	}
	/*********************************************************/
	public static void push(Stack stack,int data) {
		Node newnode=new Node(data);
		newnode.next=null;
		Node cur=stack.head;
		
		if(cur==null) {
			stack.head=newnode;
			
		}
		else {
			stack.head=newnode;
			newnode.next=cur;
		}
		
		
	}
	/**************************************************************/
	public static boolean isEmpty(Stack stack) {
		Node use=stack.head;
		if(use==null) {
			return true;
		}
		return false;
		
	}
	/*****************************************************************/
	public static boolean clear(Stack stack) {
		if(isEmpty(stack)) {
			return false;
		}
		stack.head=null;
		return true;
	}
	/******************************************************************/
	public static void print(Stack stack) {
		if(isEmpty(stack)) {
			System.out.println("its already empty");
		}
		else {
		Node cur=stack.head;int counter=0;
		while(cur!=null) {
			counter++;
			System.out.println(cur.data+"  ");
			cur=cur.next;
		}
	}
		}
	/***********************************************************************/
	public static boolean pop(Stack stack) {
		if(isEmpty(stack)) {
			return false;
		}
		stack.head=stack.head.next;
		return true;
	}
	/************************************************************************/
	public static int top(Stack stack) {
		if(isEmpty(stack)) {
			System.out.println("its empty");
		}
		int aux=stack.head.data;
		stack.head=stack.head.next;
		return aux;
		
		
		
	}
	/*************************************************************************/
	public static int peek(Stack stack) {
		if(isEmpty(stack)) {
			System.out.println("its empty");
		}
		
		return stack.head.data;
		
		
		
		
		
		
	}
	/************************************************************************/
	public static int search(Stack stack,int key) {
		Node use=stack.head;
		while(use.next!=null) {
			if(use.data==key) {
				return 1;
				
			}
			use=use.next;
			
		}
		return -1;
	}


	
	
	public static void main(String ...strings) {
		Stack stack =new Stack();
		//check if empty 
		System.out.println(stack.isEmpty(stack));
		stack.push(stack, 5);
		//check if empty after adding one element
		System.out.println(stack.isEmpty(stack));
		stack.push(stack, 4);
		stack.push(stack, 3);
		stack.push(stack, 2);
		stack.push(stack, 1);
		stack.push(stack, 0);
		//pop 0
		stack.pop(stack);
		
		//print stack elements
		stack.print(stack);
		//top
		System.out.println("top: "+stack.top(stack));
		stack.print(stack);
		//peek
		System.out.println("peek: "+stack.peek(stack));
		//search 4
		System.out.println("search 4: "+stack.search(stack, 4));
		//clear the stack
		System.out.println("clear: "+stack.clear(stack));
		stack.print(stack);
		
	}
	

}
