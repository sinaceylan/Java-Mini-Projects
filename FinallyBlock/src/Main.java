
public class Main {

	public static void main(String[] args) {
		try {
			int a = 30/0;
			
			
		}
		catch(ArithmeticException e) {
			System.out.println("Bir say� 0'a b�l�nemez !!!");
		}
		catch(NullPointerException e) {
			System.out.println("Null Referans Hatas�...");
		}
		finally {
			System.out.println("Finally Blo�u �al���yor...");
		}
		System.out.println("Buras� �al���yor mu ?");
	}

}
