package home;

public class Employee {

	public String name;
	String address;
	protected int salary; //월급
	private String rrn; //주민 번호
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
}

