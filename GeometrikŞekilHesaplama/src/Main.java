import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		String islemler="��lemler...\n"
				+"1. Kare Alan Hesapla\n"
				+"2. ��gen Alan Hesapla\n"
				+"3. Daire Alan Hesapla\n"
				+"��k�� : q ";
		
		while(true) {
			System.out.println(islemler);
			System.out.println("Hangi �eklin Alan�n� Hesaplamak �stiyorsun: ");
			String sekil_turu=scanner.nextLine();
			Sekil sekil=null;
			
			
			if(sekil_turu.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			}
			else if(sekil_turu.equals("1")) {
				System.out.println("Karenin kenar�: ");
				int kenar=scanner.nextInt();
				
				scanner.nextLine();
				
				sekil= new Kare("Kare1",kenar);
				sekil.alanHesapla();
			}
			else if(sekil_turu.equals("2")) {
				System.out.println("Kenar 1: ");
				int kenar1=scanner.nextInt();
				System.out.println("Kenar 2: ");
				int kenar2=scanner.nextInt();
				System.out.println("Kenar 3: ");
				int kenar3=scanner.nextInt();
				
				scanner.nextLine();
				
				sekil = new Ucgen("Ucgen 1", kenar1,kenar2,kenar3);
				sekil.alanHesapla();
			}
			else if(sekil_turu.equals("3")) {
				System.out.println("Dairenin Yar��ap�: ");
				int yaricap=scanner.nextInt();
				scanner.nextLine();
				
				sekil = new Daire("Daire 1",yaricap);
				sekil.alanHesapla();
			}
			else {
				System.out.println("Ge�ersiz i�lem !!!");
			}
		}

	}

}
