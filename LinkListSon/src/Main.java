import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void islemleri_bastir() {
		
		System.out.println("0- ��lemleri G�r�nt�le");
		System.out.println("1- Bir Sonraki �ehre Git");
		System.out.println("2- Bir �nceki �ehre Git");
		System.out.println("3- ��k��");
		
	}
	
	
	
	public static void sehirleri_turla(LinkedList<String> sehirler) {
		ListIterator<String>iterator=sehirler.listIterator();
		
		 int islem;
		 
		 islemleri_bastir();
		 
		 Scanner scanner= new Scanner (System.in);
		 
		 if(!iterator.hasNext()) {
			 System.out.println("�ehir Bulunmuyor !!!");
		 }
		 
		 boolean cikis=false;
		 boolean ileri=true;
		 
		 while(!cikis) {
			 System.out.println("Bir ��lem Se�iniz !!!");
			 
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
					 
					 System.out.println("�ehre Gidiliyor: "+iterator.next());
					 
				 }else {
					 System.out.println("Gidilecek �ehir Kalmad�...");
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
					 System.out.println("�ehre Gidiliyor: "+iterator.previous());
				 }else {
					 System.out.println("�ehir Turu Ba�lad�...");
				 }
				  break;
				 
			 case 3:
				 cikis=true;
				 System.out.println("Uygulamadan ��k�l�yor...");
				 break;
			 
			 
			 
			 }			 
			 
			 
			 
			 
		 }
		 
		 
		 
		 
		 
		 
	}
	public static void main(String[] args) {
		
		
		LinkedList<String> sehirler = new LinkedList<String>();
		
		sehirler.add("Ankara");
		sehirler.add("Eski�ehir");
		sehirler.add("Afyon");
		
		sehirleri_turla(sehirler);
	}

}
