import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Matematik ve Fizik Problemleri Programýna Hoþgeldin");
		
		String islemler="Ýþlemler\n"
				+"1. Daire Alaný Hesaplama\n"
				+"2. Üçgen Çevresi Hesaplama\n"
				+"3. 2 Vektörün Ýç Çarpýmýný Hesaplama\n"
				+"Çýkýþ: q ";
		
		while(true){
			System.out.println(islemler);
			System.out.println("Ýþlemi Seçiniz : ");
			String islem=scan.nextLine();
			
			if(islem.equals("q")) {
				System.out.println("Programdan Çýkýlýyor");
				break;
			}
			else if(islem.equals("1")) {
				System.out.println("Dairenin Yarýçapý : ");
				int yaricap=scan.nextInt();
				scan.nextLine();
				
				Problem.Matematik.daireAlan(yaricap);
			}
			else if(islem.equals("2")) {
				System.out.println("Kenar 1: ");
				int kenar1= scan.nextInt();
				System.out.println("Kenar 2: ");
				int kenar2=scan.nextInt();
				System.out.println("Kenar 3: ");
				int kenar3=scan.nextInt();
				
				scan.nextLine();
				
				Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
			}
			else if(islem.equals("3")) {
				
				Vec vec1= new Vec("Vectör1");
				Vec vec2= new Vec("Vectör2");
				
				Problem.Fizik.icCarpim(vec1, vec2);
				
			}
			else {
				System.out.println("Geçersiz Ýþlem !!!");
			}
		}

	}

}
