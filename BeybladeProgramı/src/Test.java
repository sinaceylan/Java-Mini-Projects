import java.util.Scanner;

public class Test {

	public static void main(String[] args) {		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Beyblade Programýna Hoþgeldiniz...");
		System.out.println("Çýkýþ için q'ya basýn...");
	
		while(true){
			System.out.println("Hangi Beyblade'i Üretmek Ýstiyorsun ?");
			String islem=scanner.nextLine();
			if(islem.equals("q")) {
				System.out.println("Programdan Çýkýlýyor...");
				break;
			}else {
				BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
				Beyblade beyblade= fabrika.beybladeUret(islem);
				
				if(beyblade == null) {
					System.out.println("Geçerli Bir Beyblade Ýsmi SEÇ !!!");
					
				}else {
					beyblade.bilgileriGoster();
					beyblade.saldýr();
					beyblade.kutsalCanavarOrtayaCikar();
				}
				
				
			}
		}
		

	}

}
