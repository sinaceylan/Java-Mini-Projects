import java.util.Scanner;

public class Yolcu implements YurtD���Kurallar� {
	
	
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Yolcu() {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Yat�rd���n�z Har� Bedeli:");
		this.harc=scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Harhangi bir siyasi yasa��n�z bulunuyor mu?");
		
		String cevap=scanner.nextLine();
		
		if(cevap.equalsIgnoreCase("evet")) {
			this.siyasiYasak=true;
		}else {
			this.siyasiYasak=false;
		}
		System.out.println("Vizeniz bulunuyor mu?");
		
		String cevap2=scanner.nextLine();
		
		if(cevap2.equalsIgnoreCase("evet")) {
			this.vizeDurumu=true;
		}else {
			this.vizeDurumu=false;
		}
		
	}
	
	@Override
	public boolean yurtdisiHarciKontrol() {
		if(this.harc<15) {
			System.out.println("L�tfen yurtd��� ��k�� harc�n� tam yat�r�n !!!");
			return false;
		}else {
			System.out.println("Yurtd��� harc� i�lemi tamam.");
			return true;
		}
		
	}
	@Override
	public boolean siyasiYasakKontrol() {
		if(this.siyasiYasak==true) {
			System.out.println("Siyasi Yasa��n�z bulunuyor. Yurtd��� izni yok !!!");
			return false;
		}else {
			System.out.println("Siyasi yasa��n�z yoktur.");
			return true;
		}
	}
	@Override
	public boolean vizeDurumuKontrol() {
		if(this.vizeDurumu==true) {
			System.out.println("Vize i�lemleri tamam.");
			return true;
		}else {
			System.out.println("Vizeniz bulunmuyor !!!");
			return false;
			
		}
	}
	
	
	
	
}
