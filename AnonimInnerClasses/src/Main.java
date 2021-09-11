
public class Main {

	public static void main(String[] args) {
		
		IOgrenci ogrenci=new IOgrenci() {
			
			public void ders_calis() {
				System.out.println("Ders �al���yorum...");
				
			}
			public void derse_gir() {
				System.out.println("Derse giriyorum...");
			}
		};
		
		ogrenci.ders_calis();
		ogrenci.derse_gir(); 

		System.out.println("**********************************");
		AOgrenci ogrenci2= new AOgrenci() {
			void kay�t_yaptir() {
				
				System.out.println("Kay�t Yap�l�yor...");
				
				
			}
		};
		
		ogrenci2.kayit_yaptir();
		ogrenci2.selamle();
		
	}
	
	public static abstract class AOgrenci{
		abstract void kayit_yaptir();
			public void selamle() {
				System.out.println("Selamlar !!!");
			}
		
	}
	
	
	public interface IOgrenci{
		void ders_calis();
		void derse_gir();
		
	}

}
