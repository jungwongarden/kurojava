package company;

public class Manager extends Employee {
	public Manager() {
		super(); //Employee();
//		super(100, 200);
	}

	private int bonus;

	public void test() {
		System.out.println("관리 감독하다.");
	}

	public void print() {
		System.out.println(name);
		System.out.println(salary);
		System.out.println(address);
		// System.out.println(rrn);
	}
}
