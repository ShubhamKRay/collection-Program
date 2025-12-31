package collectionFrameWork.priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
// PriorityQueue  used to store data in Complete Binary Tree
	public static void main(String[] args) {

//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder()); // Max Heap 
//		pq.add(123);
//		pq.add(8);
//		pq.add(1400);
//		pq.add(400);
//		pq.add(300);
//		pq.add(5);
//		pq.add(556);
//		pq.add(900);
//		pq.add(700);
//
//		System.out.println(pq);
//
//		pq.poll(); // Top Element remove
//		System.out.println(pq);

// --------------------------------------------------------------------------------

		PriorityQueue<Object> pq = new PriorityQueue<Object>();

//		pq.add(123);
//		pq.add("data");
//		pq.add(false);
//		pq.add(new Employee()); // " ClassCastException "		

		
		
//		PriorityQueue ke andar sirf wahi objects dal sakte hai jo comparable type ka ho
//		PriorityQueue me usi object ko dal sakte hai jo Comparable ko implement kiya kyunki har element ek-dusre se compare karenge
//      PriorityQueue hamesha Comparable type ke object ko hi support karti hai kyunki jo object Comparable type ka hoga uske pass compareTo() hoga jo comparison karne ke liye capable hoga
		
		
		
		
		pq.add(123); // COMPARE ? ==> compareTo(); =====> Comparable
		pq.add(1243); // Integer object aapas me compare karne ke liye compareTo() use karta hai
		pq.add(1223);
		pq.add(5123);
		pq.add(700);

		
		
		pq.add("xdata"); // COMPARE ? ==> compareTo(); =======>Comparable
		pq.add("qdata"); // String bhi aapas me compare hogi to eske class ke pass bhi compareTo() hoga
		pq.add("datta");
		pq.add("drrata");

		pq.add(new Employee());  //No compareTo() 
		
		System.out.println(pq);

	}

}
