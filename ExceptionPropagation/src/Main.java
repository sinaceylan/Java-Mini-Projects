
public class Main {

	public static void ucuncufonksiyon() {
		try {
		int a =12/0;
		}catch(ArithmeticException e) {
			System.out.println("Bir say� 0'a b�l�nemez !!!");
		}
		
	}
	public static void ikincifonksiyon() {
		ucuncufonksiyon();
	}
	public static void birincifonksiyon() {
		ikincifonksiyon();
	}
	public static void main(String[] args) {
		
		birincifonksiyon();

	}

}
