package collectionFrameWork;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo {

	public static void main(String[] args) {
		
//		LinkedList x0 = new LinkedList(); // Non Generic
//		
//		LinkedList<?> x00 = new LinkedList(); // Wild Card Generic : null
//		
//		LinkedList<Object> x = new LinkedList<Object>(); // Generic
//		x.add("pqrs");
//		x.add("raju");
//		
//		LinkedList<Object> ll = new LinkedList<Object>();
//		// ->
//		ll.add("raju");
//		ll.add(123);
//		ll.add(123);
//		ll.add(null);
//		ll.add(false);
//		ll.add('a');
//		
//		ll.remove(0);
//		
//		System.out.println(ll);
		
	/*	
		List<Object> subList = ll.subList(1, 3); // 1 2
		System.out.println(subList);
		
		
		Iterator<Object> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		for(Object o : ll) {
			System.out.println(o);
		}
		
		ll.add(2,"xyz");
		System.out.println(ll);
		
		ll.addAll(x);
		System.out.println(ll);
		
		ll.addAll(0,x);
		System.out.println(ll);
		
		ll.remove("raju");
		System.out.println(ll);
		
		Integer k = 123;
		ll.remove(k);
		System.out.println(ll);
		
		ll.remove(0);
		System.out.println(ll);
		
		ll.removeAll(x);
		System.out.println(ll);
		
		ll.clear();
		System.out.println(ll);
		
	
*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	Vector x0 = new Vector(); // Non Generic
		
		Vector<?> x00 = new Vector(); // Wild Card Generic : null
		
		Vector<Object> x = new Vector<Object>(); // Generic
		x.add("pqrs");
		x.add("raju");
		
		Vector<Object> ll = new Vector<Object>();
		// ->
		ll.add("raju");
		ll.add(123);
		ll.add(123);
		ll.add(null);
		ll.add(false);
		ll.add('a');
		
		ll.remove(0);
		
		System.out.println(ll);
		
		
	}

}

