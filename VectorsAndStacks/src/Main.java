import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		/*
		
		Vector <String> vector = new Vector<String>();
		
		vector.add("Java");
		vector.add("Pyhton");
		vector.add("Pyhton");
		vector.add("Php");
		
		for(String s: vector) {
			System.out.println(s);
		}
		
		System.out.println();
		
		ListIterator<String> iterator=vector.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		Enumeration<String>enumaration= vector.elements();
		
		while(enumaration.hasMoreElements()) {
			System.out.println(enumaration.nextElement());
		}
		
		System.out.println();
		
		System.out.println("First element: "+vector.firstElement());
		System.out.println("Last element: "+vector.lastElement());
		
		*/
		
		Stack<String> stack= new Stack<String>();
		
		stack.push("Java");
		stack.push("Python");
		stack.push("Php");
		stack.push("Go");
		
		/*
		for(String s: stack) {
			System.out.println(s);
		}
		
		System.out.println();
		
		Enumeration<String> enumeration= stack.elements();
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		*/
		
		/*
		System.out.println("Removing the last element: "+stack.pop());
		
		for(String s: stack) {
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println(stack.empty());
		
		*/
		
		while(!stack.empty()) {
			System.out.println("Removing the element: "+stack.pop());
		}
		
	}

}
