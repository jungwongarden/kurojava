package company;

public class CompanyUser {

	public static void main(String[] args) {
		Employee e = new Employee();
		//e.rrn; //private이라서 접근 불가.
		e.address = "서울";
		e.name = "박아무개";
		e.salary = 1000;
		
		System.out.println(e);
	}

}
