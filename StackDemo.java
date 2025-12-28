package collectionFrameWork;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		
//		Stack stack1 = new Stack(); //Non Generic
//		Stack<Object> stack2 = new Stack<Object>(); // Generic
//		Stack<?> stack3 = new Stack(); //Wild card Generic

		
		Stack<Object> stack = new Stack<Object>();
		stack.push("raju");
		stack.push("kaju");
		stack.push("maju");
		
		System.out.println(stack);
		
//		System.out.println(stack.pop()); // Remove
		
//		System.out.println(stack.peek()); // Top element
		
		System.out.println(stack.search("maju"));
		
		System.out.println(stack);
		
		
		
		
		
		
		
		
		
		
		
	}

}
