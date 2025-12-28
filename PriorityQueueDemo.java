package collectionFrameWork;
import java.util.*;


public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		

		
				PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			
				pq.add(123);
				pq.add(8);
				pq.add(1400);
				pq.add(400);
				pq.add(300);
				pq.add(5);
				pq.add(556);
				pq.add(900);
				pq.add(700);
				
				System.out.println(pq);
				
				pq.poll(); // Top Element remove  
				System.out.println(pq);
						
						
			

		


	}

}
