package collectionFrameWork;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Object> queue = new ArrayDeque<Object>();
/*		queue.add("raju");
		queue.add("kaju");
		queue.add("maju");
		
		
		
//		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue);
	*/			
		queue.add(123);
		queue.add(8);
		queue.add(1400);
		queue.add(300);
		queue.add(5);
		System.out.println(queue);
				
				
	}

}
