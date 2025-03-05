package StackEx;

import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(10);			//push to insert object
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(s);
		System.out.println(s.peek()); 	//to get last element
		System.out.println(s.pop());	//to remove top most elements
		System.out.println(s);
	}

}
