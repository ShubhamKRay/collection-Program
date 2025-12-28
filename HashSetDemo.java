package collectionFrameWork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		/*
		HashSet hashSet1 = new HashSet();  //Non Generic
		HashSet<Object> hashSet2 = new HashSet<Object>();  //Generic
		HashSet<?> hashSet3 = new HashSet(); // Wild Card Generic

		//// HashSet kewal unique Data ko store karta hai 
		
		
		HashSet<Object> hs = new HashSet<Object>();
		
		
		hs.add("Mohan");
		hs.add("Sohan");
		hs.add("Rohan");
	    hs.add("Uttam");
	    System.out.println(hs);
		
		hs.remove("Mohan");
		System.out.println(hs);
		
		
		int hashCode = "Mohan".hashCode();
		System.out.println(hashCode);
		
		int hashCode1 = "Aa".hashCode();
		System.out.println(hashCode1);
		
		int hashCode2 = "BB".hashCode();
		System.out.println(hashCode);
		
		
		System.out.println(hs.contains("Mohan"));
		
		*/
		
		
		
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		
		lhs.add("Mohan");
		lhs.add("Sohan");
		lhs.add("Rohan");
		System.out.println(lhs);
		
		
		
		
		
		
		
		
		
	/*	
		
		TreeSet<Object> ts = new TreeSet<Object>();
//		ts.add("raju");
//		ts.add("aju");
//		ts.add("ma");
		
		
		ts.add(100);
		ts.add(50);
		ts.add(5);
		
		
		
		System.out.println(ts);
		
		*/
	}

}
