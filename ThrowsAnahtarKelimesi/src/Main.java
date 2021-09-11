import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	
	public static void mekan_kontrol(int age) throws IOException {
		if(age < 18) {
			throw new IOException();
			
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
			
		}catch(IOException ex) {
			System.out.println("IOException Oluþtu...");
		}
		
		
		

	}

}

