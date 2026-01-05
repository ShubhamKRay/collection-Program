package collectionFrameWork.comparable;

import java.util.TreeSet;

public class Launch {

	public static void main(String[] args) {

		Employee e1 = new Employee(11, 18, "araju");
		Employee e2 = new Employee(12, 19, "braju");
		Employee e3 = new Employee(13, 20, "craju");
		Employee e4 = new Employee(14, 21, "draju");

		TreeSet<Employee> treeset = new TreeSet<Employee>();

		treeset.add(e2); // By default Ascending Order Natural
		treeset.add(e1);
		treeset.add(e3);
		treeset.add(e4);

		System.out.println(treeset);
	}
}
