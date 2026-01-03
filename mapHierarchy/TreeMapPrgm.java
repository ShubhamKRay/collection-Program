package collectionFrameWork.mapHierarchy;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapPrgm {

	public static void main(String[] args) {

		TreeMap<Integer, String> hashmap = new TreeMap<Integer, String>();

		hashmap.put(11, "raju"); // Entry<Integer,String>
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
