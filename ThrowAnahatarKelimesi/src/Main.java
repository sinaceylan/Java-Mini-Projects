import java.util.Scanner;

public class Main {
	
	public static void mekan_kontrol(int age) {
		if(age < 18) {
			throw new ArithmeticException();
			
		}else {
			System.out.println("Welcome !!!");
		}
	}

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your age:");
		int age=scan.nextInt();
		
		try {
		mekan_kontrol(age);
		}
		catch(ArithmeticException e) {
			System.out.println("Your age is under 18 !!!");
		}
		
		
		

	}

}
