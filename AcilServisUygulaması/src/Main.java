import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<Hasta>acilservis=new PriorityQueue<Hasta>();
		acilservis.offer(new Hasta("Murat Bey","Yan�k"));
		acilservis.offer(new Hasta("Okan Bey","Ba� A�r�s�"));
		acilservis.offer(new Hasta("Elif Han�m","Apandisit"));
		acilservis.offer(new Hasta("O�uz Bey","Yan�k"));
		acilservis.offer(new Hasta("Merve Han�m","Yan�k"));
		acilservis.offer(new Hasta("Gizem Han�m","Apanidisit"));
		
		int i=1;
		
		while(acilservis.isEmpty()!=true) {
			System.out.println("*****************************");
			System.out.println(i+". s�rada");
			System.out.println(acilservis.poll());
			System.out.println("*****************************");
			i++;
		}
		
	}

}
