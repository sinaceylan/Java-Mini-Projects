import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		 Queue<String> queue=new LinkedList<String>();
		 queue.offer("Java");
		 queue.offer("Python");
		 queue.offer("Php");
		 queue.offer("C++");
		 
		 
		 for(String s: queue) {
			 System.out.println(s);
		 }
		 
		 System.out.println("**********************");
		 System.out.println("Eleman ��kart�l�yor: "+queue.poll());
		 
		 for(String s: queue) {
			 System.out.println(s);
		 }
		 
		 
		 
	}

}
