package core.programs;


import java.util.Stack;
public class Stack_program {

	public static void main(String[] args)
	{

	Stack stack1 = new Stack();

	    // Initialization of Stack using Generics
	    Stack<String> stack2 = new Stack<String>();

	    // pushing the elements
	    stack1.push("straberry");
	    stack1.push("apple");
	    stack1.push("banana");
	    stack1.push("orange");
	    stack1.push("grapes");
	    stack1.push("pondicherry");
	    stack1.push("darjilling");
	    stack1.push("tirupati");
	    stack1.push("chennai");
	    stack1.push("8");
	    stack1.push("17");
	    stack1.push("12");
	    stack1.push("11");
	    stack1.push("O");
	    stack1.push("s");
	     
	   
	    System.out.println(stack1);
	   
	    stack1.pop();
	    stack1.pop();
	    stack1.pop();
	    stack1.pop();
	    stack1.pop();
	   
	    System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
	   
	    stack1.pop();
	    stack1.pop();
	   
	    System.out.println("after removing 2 elements"+ " stack-1 is: " + stack1.peek());
	   
	    System.out.println("index of elemtn  inside the stack "+ stack1.indexOf("apple"));
	    System.out.println("index of elemtn  inside the stack "+ stack1.indexOf("tirupati"));
	         
	}
	}