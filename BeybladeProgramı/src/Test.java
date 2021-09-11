import java.util.Scanner;

public class Test {

	public static void main(String[] args) {		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Beyblade Program�na Ho�geldiniz...");
		System.out.println("��k�� i�in q'ya bas�n...");
	
		while(true){
			System.out.println("Hangi Beyblade'i �retmek �stiyorsun ?");
			String islem=scanner.nextLine();
			if(islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			}else {
				BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
				Beyblade beyblade= fabrika.beybladeUret(islem);
				
				if(beyblade == null) {
					System.out.println("Ge�erli Bir Beyblade �smi SE� !!!");
					
				}else {
					beyblade.bilgileriGoster();
					beyblade.sald�r();
					beyblade.kutsalCanavarOrtayaCikar();
				}
				
				
			}
		}
		

	}

}
