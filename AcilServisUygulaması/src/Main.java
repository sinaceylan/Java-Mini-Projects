import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<Hasta>acilservis=new PriorityQueue<Hasta>();
		acilservis.offer(new Hasta("Murat Bey","Yanýk"));
		acilservis.offer(new Hasta("Okan Bey","Baþ Aðrýsý"));
		acilservis.offer(new Hasta("Elif Haným","Apandisit"));
		acilservis.offer(new Hasta("Oðuz Bey","Yanýk"));
		acilservis.offer(new Hasta("Merve Haným","Yanýk"));
		acilservis.offer(new Hasta("Gizem Haným","Apanidisit"));
		
		int i=1;
		
		while(acilservis.isEmpty()!=true) {
			System.out.println("*****************************");
			System.out.println(i+". sýrada");
			System.out.println(acilservis.poll());
			System.out.println("*****************************");
			i++;
		}
		
	}

}
