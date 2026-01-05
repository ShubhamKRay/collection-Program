package collectionFrameWork.comparable;

public class Employee implements Comparable<Employee> {

	private int id;
	private int age;
	private String name;

	@Override
	public int compareTo(Employee o) {
		System.out.println(o);
		return o.id - this.id;   //12-11=>POS
      //return this.id - o.id;  //------------> 11-12=>NEG                
		                        //12-13=>NEG
		                       //12-14=>NEG , 13-14=>NEG
	}

	public Employee(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

}
