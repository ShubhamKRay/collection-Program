package collectionFrameWork.linkedList;

public class LLDemo {

	public static void main(String[] args) {

		LinkedList test = new ArrayList();
		test.add("test1");  
		test.add("test2");  
		System.out.println(test);
		
		System.out.println("========================================");
		
		LinkedList al = new ArrayList();
		al.add(1234);                     
		al.add(1234.56f);
		al.add("xyz");
		al.add('a');
		al.add(false);
		
		System.out.println(al);
		al.add(2,8000);
		System.out.println(al);
		
		al.addAll(test);
		System.out.println(al);
		
		al.addAll(0,test);
		System.out.println(al);
		System.out.println(al.get(2));

//		 ===============================================================

//		ArrayList al = new ArrayList();
//		
//		//->   iterator ke liye cursor hamara yaha par rahega check karega agar value hai to while loop true ho jaega 
//		
//		al.add(1234);                     
//		al.add(1234.56f);
//		al.add("xyz");
//		al.add('a');
//		al.add(false);
//		
//		System.out.println(al);
//		System.out.println(al.get(3));
//		
//		System.out.println("=================for loop====================");
//		//for loop
//		for(int i=0; i<al.size() ; i++) {
//			System.out.println(al.get(i));
//		}
//		
//		System.out.println("=================forEach loop====================");
//		//forEach loop
//		for(Object o : al)
//			System.out.println(o);
//	
//		System.out.println("====================================");
//		
//		Iterator iterator = al.iterator();
//		while(iterator.hasNext()) {     // hasNext() check karega ki value hai ya nhi agar hoga tabhi condition true hoga
//			System.out.println(iterator.next());    // next - next ko print karte jaenge
//		}

		// ===========================================================

//		ArrayList test = new ArrayList();
//		test.add(false);
//		test.add('a');
//		test.add("test2");
//
//		System.out.println(test);
//		
//		ArrayList al = new ArrayList();
//
//		al.add(1234);
//		al.add(1234.56f);
//		al.add("xyz");
//		al.add('a');
//		al.add("xyz");
//		al.add(false);
//		al.add(123);
//		System.out.println(al);
//		al.remove("xyz");
//		al.remove(0);
//		al.removeAll(test);
//		Integer i = 123;
//		al.remove(i);
//		System.out.println(al);

		// ================================================================

//		ArrayList al = new ArrayList();
//
//		al.add(123);
//		al.add(55);
//		al.add(90);
//		al.add(20);
//		al.add(2);
//		al.add(80);
//		System.out.println(al);
//		
//		Integer i=2;
//		al.remove(i);
//		//index->primitive
//		//data->object
//		
//		System.out.println(al);

		// ============================================================

		ArrayList al = new ArrayList();

		al.add(null);
		al.add(55);
		al.add(90);
		al.add(null);
		al.add(2);
		al.add(80);
		System.out.println(al);

		List<Object> sublist = al.subList(1, 3);   // 1 se 3 ke beech me
		System.out.println(sublist);
		
		System.out.println(al.isEmpty());
		System.out.println(al.contains(90)); // check karega ki ye wali value hai ya nhi true or false return karega
		al.set(2, 1000);

		System.out.println(al);
		
		System.out.println(al.indexOf(123));  //
		System.out.println(al.lastIndexOf(123));
		
		
		
		Object [] array = al.toArray(); //collection ko array me convert kar diya

		System.out.println(array);
		
		
		System.out.println("--------------------------------------------");

		al.clear(); // all vaue clear kar dega
		System.out.println(al);
	}
}
