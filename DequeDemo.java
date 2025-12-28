package collectionFrameWork;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {
		
		Deque<Object> dq = new ArrayDeque<Object>();
		dq.addFirst("raju");
		dq.addFirst("kaju");
		dq.addLast("xraju");
		dq.addLast("xkaju");
		System.out.println(dq);
		
//		dq.clear();
		
//		dq.removeFirst();
//		dq.removeLast();
//		System.out.println(dq);
		
		dq.pollFirst();
		dq.pollLast();
		System.out.println(dq);
		
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		
		
		
		
	}

}
