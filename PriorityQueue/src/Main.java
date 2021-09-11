import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player>{
	private String isim;
	private int id;
	
	public Player(String isim,int id) {
		this.isim=isim;
		this.id=id;
	}

	@Override
	public int compareTo(Player player) {
		
		if(this.id<player.id) {
			return 1;
		}
		else if(this.id>player.id) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Player [isim=" + isim + ", id=" + id + "]";
	}
	
	
	
	
}
public class Main {

	public static void main(String[] args) {
		Queue<Player>queue=new PriorityQueue<Player>();
		
		queue.offer(new Player("Sina",5));
		queue.offer(new Player("Mehmet",1));
		queue.offer(new Player("Oðuz",100));
		
		while(!queue.isEmpty()) {
			System.out.println("Eleman çýkarýlýyor: "+queue.poll());
		}
		
		
		/*
		queue.offer(5);
		queue.offer(1);
		queue.offer(2);
		queue.offer(100);
		
		System.out.println(queue.peek());
		
		
		//for(Integer i: queue) {
		//	System.out.println(i);
		//}
		
		//queue.clear();
		
		//System.out.println(queue.contains(100));
		
		
		while(!queue.isEmpty()) {
			System.out.println("Eleman Çýkarýlýyor: "+queue.poll());
		}
		
		*/
		
	}

}
