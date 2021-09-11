
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Sabiha Gökçen'e Hoþgeldiniz");

		String sartlar="Yurtdýþý Çýkýþ Kurallarý...\n"
				+"Herhangi bir yasaðýnýz olmamalý...\n"
				+"15 TL harç bedeli ödenmiþ olmalý...\n"
				+"Gideceðiniz yere vizeniz olmalý...";
		
		String message ="Yurtdýþý þartlarýndan hepsini saðlamanýz gerekiyor";
		
		while(true) {
			System.out.println("********************************************");
			System.out.println(message);
			System.out.println("********************************************");
			System.out.println(sartlar);
			
			Yolcu yolcu= new Yolcu();
			
			System.out.println("Harç Bedeli Kontrol Ediliyor...");
			
			Thread.sleep(3000);
			
			if(yolcu.yurtdisiHarciKontrol()==false) {
				System.out.println(message);
				continue;
			}
			System.out.println("Siyasi Yasak Kontrol Ediliyor...");
			
			Thread.sleep(3000);
			
			if(yolcu.siyasiYasakKontrol()==false) {
				System.out.println(message);
				continue;
			}
			System.out.println("Vize Durumu Kontrol Ediliyor...");
			
			Thread.sleep(3000);
			
			if(yolcu.vizeDurumuKontrol()==false) {
				System.out.println(message);
				continue;
				
			}
			System.out.println("Ýþlemleriniz Tamam !!! Ýyi Yolculuklar !!!");
			break;
			
		}
				
	}

}
