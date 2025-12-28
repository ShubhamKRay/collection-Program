package collectionFrameWork.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Launch {

	public static void main(String[] args) {

//		ArrayList test = new ArrayList();
//		test.add("test1");  
//		test.add("test2");  
//		System.out.println(test);
//		
//		System.out.println("======================");
//		
//		ArrayList al = new ArrayList();
//		al.add(1234);                     
//		al.add(1234.56f);
//		al.add("xyz");
//		al.add('a');
//		al.add(false);
//		
//		System.out.println(al);
//		al.add(2,8000);
//		System.out.println(al);
//		
//		al.addAll(test);
//		System.out.println(al);
//		
//		al.addAll(0,test);
//		System.out.println(al);
//		System.out.println(al.get(2));

//		 ===============================================================

//		@SuppressWarnings("rawtypes")
//		ArrayList al = new ArrayList();
//		
//		//->
//		
//		al.add(1234);                     
//		al.add(1234.56f);
//		al.add("xyz");
//		al.add('a');
//		al.add(false);
//		
//		System.out.println(al.get(3));
//		
//		for(int i=0; i<al.size() ; i++) {
//			System.out.println(al.get(i));
//		}
//	
//		System.out.println("====================================");
//		
//		Iterator iterator = al.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

		// ===========================================================
		
		ArrayList test = new ArrayList();
		test.add(false);
		test.add('a');
		test.add("test2");

		System.out.println(test);
		
		ArrayList al = new ArrayList();

		al.add(1234);
		al.add(1234.56f);
		al.add("xyz");
		al.add('a');
		al.add("xyz");
		al.add(false);
		
		System.out.println(al);
		al.remove("xyz");
		al.remove(0);
		al.removeAll(test);
		
		System.out.println(al);
		
	//================================================================	
		

//		ArrayList al = new ArrayList();
//
//		al.add(123);
//		al.add(55);
//		al.add(90);
//		al.add(20);
//		al.add(2);
//		al.add(80);
//		
//		Integer i=2;
//		al.remove(i);
//		//index->primitive
//		//data->object
//		
//		System.out.println(al);
		
		
		
		//============================================================
		
		
//		ArrayList al = new ArrayList();
//
//		al.add(null);
//		al.add(55);
//		al.add(90);
//		al.add(null);
//		al.add(2);
//		al.add(80);
//		
//		System.out.println(al.isEmpty());
//		System.out.println(al.contains(90));
//		al.set(2, 1000);
	}
}

