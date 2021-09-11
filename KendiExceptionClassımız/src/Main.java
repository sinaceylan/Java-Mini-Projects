import java.util.Scanner;

public class Main {
	
	public static void mekan_kontrol(int age) {
		if(age<18) {
			throw new InvalidAgeException("Invalid Age");
		}else {
			System.out.println("Mekana Hoþ Geldiniz !!!");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen yaþýnýzý girin !!!");
		int age=scan.nextInt();
		try {
			mekan_kontrol(age);
		}catch(InvalidAgeException e){
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
