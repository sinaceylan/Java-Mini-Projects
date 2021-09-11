
public class Main {

	public static void main(String[] args) {
		//int [] a= {1,2,3,4,5};
		//System.out.println(a[6]);
		
		//System.out.println("Burasý Çalýþýyor...");
		
		 try {
			 
			 int b=30/0;
			 
			 int[] a= {1,2,3,4,5}; 
			 
			 System.out.println(a[6]);
			 
			 
		 }
		 catch(ArithmeticException e) {
			 System.out.println("Bir sayý 0'a bölünemez !!!");
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("Arrayin Boyunu Aþtýnýz !!!");
		 }
		 catch(Exception e) {
			 System.out.println("Bir hata oluþtu !!!");
			 e.printStackTrace();
		 }
		 //catch(ArrayIndexOutOfBoundsException e) 
		 //catch(RuntimeException e)
		 //{
		 //	 e.printStackTrace();
		 
		 //}
		 System.out.println("Burasý Çalýþýyor...");

}
	}
