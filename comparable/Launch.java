package collectionFrameWork.comparable;

import java.util.TreeSet;

public class Launch {

	public static void main(String[] args) {

		Employee e2 = new Employee(11, 18, "araju");
		Employee e1 = new Employee(12, 19, "braju");
		Employee e3 = new Employee(13, 20, "craju");
		Employee e4 = new Employee(14, 21, "draju");

		TreeSet<Employee> treeset = new TreeSet<Employee>();

		
//		treeset.add(e1);  //By default Ascending Order Natural
//		treeset.add(e2); 
//		treeset.add(e3); 
//		treeset.add(e4); 
		
		
		treeset.add(e2); //[e2]->start  
		treeset.add(e1); //[e2 e1]     //[e1 e2] <-----this.id-o.id
		treeset.add(e3); //[e3 e2 e1]
		treeset.add(e4); //[e4 e3 e2 e1]

		System.out.println(treeset);
	}
}
