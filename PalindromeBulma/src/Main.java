import java.util.Scanner;
import java.util.Stack;

public class Main {

	//kasaylabalyasak
	
	public static void main(String[] args) {
		
		 Scanner scan= new Scanner(System.in);
		 
		 System.out.println("Please write a sentence: ");
		 
		 String cumle=scan.nextLine();
		 
		 Stack<Character> stack = new Stack<Character>();
		 
		 for(int i=0;i<cumle.length()/2;i++) {
			 stack.push(cumle.charAt(i));
			 
		 }
		if(isPalindrome(cumle,stack)) {
			System.out.println("This sentence is Palindrome.");
		}else {
			System.out.println("This sentence is not a Palindrome.");
		}
		
	}
	public static boolean isPalindrome(String cumle,Stack<Character>stack) {
		for(int i =(cumle.length()/2)+1 ; i<cumle.length(); i++){
			if(cumle.charAt(i) != stack.pop()) {
				return false;
				
			}
		}
		return true;
	}

}
