package collectionFrameWork.mapHierarchy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPrgm {

	public static void main(String[] args) {

		// HashMap hashmap = new HashMap<>();//NON GENERIC
		// HashMap<Integer,String> hashmap = new HashMap<Integer,String>();//GENERIC
		// HashMap<?,?> hashmap = new HashMap();// WILD CARD GENERIC

		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		hashmap.put(11, "raju"); // Entry object -> store
		hashmap.put(12, "kaju");
		hashmap.put(13, "maju");
		hashmap.put(14, "sohan");
		hashmap.put(15, "raju");
		hashmap.put(15, "raju");
		hashmap.put(15, "raju");
		hashmap.put(16, "kaju");
		hashmap.put(16, "kaju");

		hashmap.remove(16);
		
		// Iterator
		Set<Entry<Integer, String>> entrySet = hashmap.entrySet();

		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println(hashmap);
	}
}
