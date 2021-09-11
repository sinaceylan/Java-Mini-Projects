
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Sabiha G�k�en'e Ho�geldiniz");

		String sartlar="Yurtd��� ��k�� Kurallar�...\n"
				+"Herhangi bir yasa��n�z olmamal�...\n"
				+"15 TL har� bedeli �denmi� olmal�...\n"
				+"Gidece�iniz yere vizeniz olmal�...";
		
		String message ="Yurtd��� �artlar�ndan hepsini sa�laman�z gerekiyor";
		
		while(true) {
			System.out.println("********************************************");
			System.out.println(message);
			System.out.println("********************************************");
			System.out.println(sartlar);
			
			Yolcu yolcu= new Yolcu();
			
			System.out.println("Har� Bedeli Kontrol Ediliyor...");
			
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
			System.out.println("��lemleriniz Tamam !!! �yi Yolculuklar !!!");
			break;
			
		}
				
	}

}
