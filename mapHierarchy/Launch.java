package collectionFrameWork.mapHierarchy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Launch {

	public static void main(String[] args) {

		
		//PINCODE ====> 5 CARS
		//Integer ====>List<String
		
		ArrayList<String> area1 = new ArrayList<String>();

		area1.add("xyz1");
		area1.add("xyz2");
		area1.add("xyz3");
		area1.add("xyz4");
		area1.add("xyz5");

		ArrayList<String> area2 = new ArrayList<String>();

		area2.add("qxyz1");
		area2.add("qxyz2");
		area2.add("qxyz3");
		area2.add("qxyz4");
		area2.add("qxyz5");

		ArrayList<String> area3 = new ArrayList<String>();

		area3.add("aqxyz1");
		area3.add("aqxyz2");
		area3.add("aqxyz3");
		area3.add("aqxyz4");
		area3.add("aqxyz5");

		HashMap<Integer, List<String>> hashmap = new HashMap<Integer, List<String>>();

		hashmap.put(123456, area1);
		hashmap.put(124456, area2);
		hashmap.put(123666, area3);

		for (Entry<Integer, List<String>> e : hashmap.entrySet()) {
			System.out.println("PINCODE : " + e.getKey());
			List<String> value = e.getValue();
			for (String name : value) {
				System.out.println(name);
			}
		}

		System.out.println(hashmap);

	}

}
