package collectionFrameWork.wildCardGenerics;

import java.util.ArrayList;

public class Launch {

	public static void main(String[] args) {

		ArrayList<String> data = new AnamCollection<String>();
		data.add("raju");
		data.add("kaju");
		data.add("maju");

		ArrayList<?> al = data; // FOR READ ONLY
		pass(al);
	}

	private static void pass(ArrayList<?> al) {

		al.add(null);

		for (Object o : al) {
			System.out.println(o);
		}

	}

}
