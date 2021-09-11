import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void islemleri_bastir() {
		
		System.out.println("0- Ýþlemleri Görüntüle");
		System.out.println("1- Bir Sonraki Þehre Git");
		System.out.println("2- Bir Önceki Þehre Git");
		System.out.println("3- Çýkýþ");
		
	}
	
	
	
	public static void sehirleri_turla(LinkedList<String> sehirler) {
		ListIterator<String>iterator=sehirler.listIterator();
		
		 int islem;
		 
		 islemleri_bastir();
		 
		 Scanner scanner= new Scanner (System.in);
		 
		 if(!iterator.hasNext()) {
			 System.out.println("Þehir Bulunmuyor !!!");
		 }
		 
		 boolean cikis=false;
		 boolean ileri=true;
		 
		 while(!cikis) {
			 System.out.println("Bir Ýþlem Seçiniz !!!");
			 
			 islem=scanner.nextInt();
			 
			 switch(islem) {
			 
			 case 0:
				 islemleri_bastir();
				 break;
				 
			 case 1:
				 if(!ileri) {
					 if(iterator.hasNext()) {
						 
						 iterator.next();
					 }
					 ileri=true;
				 }
				 if(iterator.hasNext()) {
					 
					 System.out.println("Þehre Gidiliyor: "+iterator.next());
					 
				 }else {
					 System.out.println("Gidilecek Þehir Kalmadý...");
					 ileri=true;
				 }
				 break;
				 
			 case 2:
				 if(ileri) {
					 if(iterator.hasPrevious()) {
						 iterator.previous();
					 }
					 ileri=false;
				 }
				 if(iterator.hasPrevious()) {
					 System.out.println("Þehre Gidiliyor: "+iterator.previous());
				 }else {
					 System.out.println("Þehir Turu Baþladý...");
				 }
				  break;
				 
			 case 3:
				 cikis=true;
				 System.out.println("Uygulamadan Çýkýlýyor...");
				 break;
			 
			 
			 
			 }			 
			 
			 
			 
			 
		 }
		 
		 
		 
		 
		 
		 
	}
	public static void main(String[] args) {
		
		
		LinkedList<String> sehirler = new LinkedList<String>();
		
		sehirler.add("Ankara");
		sehirler.add("Eskiþehir");
		sehirler.add("Afyon");
		
		sehirleri_turla(sehirler);
	}

}
