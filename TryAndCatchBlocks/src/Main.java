
public class Main {

	public static void main(String[] args) {
		//int [] a= {1,2,3,4,5};
		//System.out.println(a[6]);
		
		//System.out.println("Buras� �al���yor...");
		
		 try {
			 
			 int b=30/0;
			 
			 int[] a= {1,2,3,4,5}; 
			 
			 System.out.println(a[6]);
			 
			 
		 }
		 catch(ArithmeticException e) {
			 System.out.println("Bir say� 0'a b�l�nemez !!!");
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("Arrayin Boyunu A�t�n�z !!!");
		 }
		 catch(Exception e) {
			 System.out.println("Bir hata olu�tu !!!");
			 e.printStackTrace();
		 }
		 //catch(ArrayIndexOutOfBoundsException e) 
		 //catch(RuntimeException e)
		 //{
		 //	 e.printStackTrace();
		 
		 //}
		 System.out.println("Buras� �al���yor...");

}
	}
