package collectionFrameWork.wildCardGenerics;

import java.util.ArrayList;

public class Launch {

	public static void main(String[] args) {

//		ArrayList<String> data = new ArrayList<String>();

		ArrayList<String> data = new AnamCollection<String>();
		data.add("raju");
		data.add("kaju");
		data.add("maju");

		ArrayList<?> al = data; // FOR READ ONLY
		pass(al);
	}

	private static void pass(ArrayList<?> al) {

		al.add(null); // ArrayList me null allowed ho raha hai esko hum rokna chahta hu to uske liye
						// hum ArrayList ko extends karke new collection bana lenge jise hum custom
						// collection bol sakte hai
						// AnamCollection
		for (Object o : al) {
			System.out.println(o);
		}

	}

}
