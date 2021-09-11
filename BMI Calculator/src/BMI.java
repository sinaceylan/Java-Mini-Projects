import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		calculateBMI();

	}

	private static void calculateBMI() {
		
		System.out.println("Please enter your weight in kg: ");
		
		Scanner scan= new Scanner(System.in);
		float weight= scan.nextFloat();
		
		System.out.println("Please enter your height in cm: ");
		float height=scan.nextFloat();
		
		float bmi=(100*weight*100)/(height*height);
		
		System.out.println("Your BMI is: "+bmi);
		
		printBMICategory(bmi);
		
	}

	private static void printBMICategory(float bmi) {
		if(bmi<18.5) {
			System.out.println("You are underweight");
			
		}else if(bmi<25) {
			System.out.println("You are normal");
		}else if(bmi<30) {
			System.out.println("You are overweight");
		}else {
			System.out.println("You are obese");
		}
	}

		
	}


