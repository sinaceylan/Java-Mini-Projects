import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kumanda Program�na Ho�geldiniz...");
		Scanner scan=new Scanner(System.in);
		
		String islemler="��lemler...\n"
					+"1.Kanallar� G�ster\n"
					+"2.Kanal Ekle\n"
					+"3.Kanal Sil\n"
					+"4.Kanal Say�s� �p�ren\n"
					+"��k�� i�in q'ya bas�n...";
		
		Kumanda kumanda=new Kumanda();
		
		while(true) {
			System.out.println(islemler);
			System.out.println("��lemi Giriniz:");
			String islem=scan.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			}
			else if(islem.equals("1")) {
				kanallar�Goster(kumanda);
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
				System.out.println("Kanal Say�s�: "+kumanda.kanalSayisi());
			}
			else {
				System.out.println("Ge�ersiz ��lem...");			
				}
		}
		
	}
	public static void kanallar�Goster(Kumanda kumanda) {
		if(kumanda.kanalSayisi()==0) {
			System.out.println("�u anda hi�bir kanal bulunmuyor...");
		}else {
			for(String kanal: kumanda) {
				System.out.println("Kanal:"+kanal);
			}
		}
	}
	
	
}
