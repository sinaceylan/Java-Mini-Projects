import java.util.Scanner;

public class Yolcu implements YurtDýþýKurallarý {
	
	
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Yolcu() {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Yatýrdýðýnýz Harç Bedeli:");
		this.harc=scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Harhangi bir siyasi yasaðýnýz bulunuyor mu?");
		
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
			System.out.println("Lütfen yurtdýþý çýkýþ harcýný tam yatýrýn !!!");
			return false;
		}else {
			System.out.println("Yurtdýþý harcý iþlemi tamam.");
			return true;
		}
		
	}
	@Override
	public boolean siyasiYasakKontrol() {
		if(this.siyasiYasak==true) {
			System.out.println("Siyasi Yasaðýnýz bulunuyor. Yurtdýþý izni yok !!!");
			return false;
		}else {
			System.out.println("Siyasi yasaðýnýz yoktur.");
			return true;
		}
	}
	@Override
	public boolean vizeDurumuKontrol() {
		if(this.vizeDurumu==true) {
			System.out.println("Vize iþlemleri tamam.");
			return true;
		}else {
			System.out.println("Vizeniz bulunmuyor !!!");
			return false;
			
		}
	}
	
	
	
	
}
