import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kumanda Programýna Hoþgeldiniz...");
		Scanner scan=new Scanner(System.in);
		
		String islemler="Ýþlemler...\n"
					+"1.Kanallarý Göster\n"
					+"2.Kanal Ekle\n"
					+"3.Kanal Sil\n"
					+"4.Kanal Sayýsý Öpðren\n"
					+"Çýkýþ için q'ya basýn...";
		
		Kumanda kumanda=new Kumanda();
		
		while(true) {
			System.out.println(islemler);
			System.out.println("Ýþlemi Giriniz:");
			String islem=scan.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan Çýkýlýyor...");
				break;
			}
			else if(islem.equals("1")) {
				kanallarýGoster(kumanda);
			}
			else if(islem.equals("2")) {
				System.out.println("Eklenecek Kanal: ");
				String kanal_ismi=scan.nextLine();
				kumanda.kanalEkle(kanal_ismi);
			}
			else if(islem.equals("3")) {
				System.out.println("Silinecek Kanal:");
				String kanal_ismi=scan.nextLine();
				
				kumanda.kanalSil(kanal_ismi);
			}
			else if(islem.equals("4")) {
				System.out.println("Kanal Sayýsý: "+kumanda.kanalSayisi());
			}
			else {
				System.out.println("Geçersiz Ýþlem...");			
				}
		}
		
	}
	public static void kanallarýGoster(Kumanda kumanda) {
		if(kumanda.kanalSayisi()==0) {
			System.out.println("Þu anda hiçbir kanal bulunmuyor...");
		}else {
			for(String kanal: kumanda) {
				System.out.println("Kanal:"+kanal);
			}
		}
	}
	
	
}
