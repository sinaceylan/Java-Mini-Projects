
public class Main {

	public static void main(String[] args) {
		try {
			int a = 30/0;
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("Bir sayý 0'a bölünemez !!!");
		}
		catch(NullPointerException e) {
			System.out.println("Null Referans Hatasý...");
		}
		finally {
			System.out.println("Finally Bloðu Çalýþýyor...");
		}
		System.out.println("Burasý çalýþýyor mu ?");
	}

}
