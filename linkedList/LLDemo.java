package collectionFrameWork.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LLDemo {

	public static void main(String[] args) {

		LinkedList test = new ArrayList();
		test.add("test1");  
		test.add("test2");  
		System.out.println(test);
		
		System.out.println("========================================");
		
//		LinkedList ll = new LinkedList();
//		ll.add(1234);                     
//		ll.add(1234.56f);
//		ll.add("xyz");
//		ll.add('a');
//		ll.add(false);
//		
//		System.out.println(ll);
//		ll.add(2,8000);
//		System.out.println(ll);
//		
//		ll.addAll(test);
//		System.out.println(ll);
//		
//		ll.addAll(0,test);
//		System.out.println(ll);
//		System.out.println(ll.get(2));

//		 ===============================================================

		LinkedList ll = new LinkedList();
		
		//->   iterator ke liye cursor hamara yaha par rahega check karega agar value hai to while loop true ho jaega 
		
		ll.add(1234);                     
		ll.add(1234.56f);
		ll.add("xyz");
		ll.add('a');
		ll.add(false);
		
		System.out.println(ll);
		System.out.println(ll.get(3));
		
		System.out.println("=================for loop====================");
		//for loop
		for(int i=0; i<ll.size() ; i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("=================forEach loop====================");
//		//forEach loop
//		for(Object o : ll)
//			System.out.println(o);
//	
//		System.out.println("====================================");
//		
//		Iterator iterator = ll.iterator();
//		while(iterator.hasNext()) {     // hasNext() check karega ki value hai ya nhi agar hoga tabhi condition true hoga
//			System.out.println(iterator.next());    // next - next ko print karte jaenge
//		}

		// ===========================================================

//		LinkedList test = new LinkedList();
//		test.add(false);
//		test.add('a');
//		test.add("test2");
//
//		System.out.println(test);
//		
//		LinkedList ll = new LinkedList();
//
//		ll.add(1234);
//		ll.add(1234.56f);
//		ll.add("xyz");
//		ll.add('a');
//		ll.add("xyz");
//		ll.add(false);
//		ll.add(123);
//		System.out.println(ll);
//		ll.remove("xyz");
//		ll.remove(0);
//		ll.removeAll(test);
//		Integer i = 123;
//		ll.remove(i);
//		System.out.println(ll);

		// ================================================================

//		LinkedList ll = new LinkedList();
//
//		ll.add(123);
//		ll.add(55);
//		ll.add(90);
//		ll.add(20);
//		ll.add(2);
//		ll.add(80);
//		System.out.println(ll);
//		
//		Integer i=2;
//		ll.remove(i);
//		//index->primitive
//		//data->object
//		
//		System.out.println(ll);

		// ============================================================

//		LinkedList ll = new LinkedList();
//
//		ll.add(null);
//		ll.add(55);
//		ll.add(90);
//		ll.add(null);
//		ll.add(2);
//		ll.add(80);
//		System.out.println(ll);
//
//		List<Object> sublist = ll.subList(1, 3);   // 1 se 3 ke beech me
//		System.out.println(sublist);
//		
//		System.out.println(ll.isEmpty());
//		System.out.println(ll.contains(90)); // check karega ki ye wali value hai ya nhi true or false return karega
//		ll.set(2, 1000);
//
//		System.out.println(ll);
//		
//		System.out.println(ll.indexOf(123));  //
//		System.out.println(ll.lastIndexOf(123));
//		
//		
//		
//		Object [] array = ll.toArray(); //collection ko array me convert kar diya
//
//		System.out.println(array);
//		
//		
//		System.out.println("--------------------------------------------");
//
//		ll.clear(); // all vaue clear kar dega
//		System.out.println(ll);
	}
}
