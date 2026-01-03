package collectionFrameWork.mapHierarchy;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapPrgm {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> hashmap = new LinkedHashMap<Integer, String>();

		hashmap.put(11, "raju"); //Entry<Integer,String>
		hashmap.put(12, "kaju");
		hashmap.put(13, "maju");
		hashmap.put(14, "sohan");
		hashmap.put(15, "raju");

		System.out.println(hashmap);

		Set<Entry<Integer, String>> entrySet = hashmap.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {

			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + "->" + entry.getValue());

		}

	}
}
