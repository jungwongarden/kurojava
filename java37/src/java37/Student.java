package java37;

public class Student {
	String name;
	int age;
	String tel;

	public Student(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}
	
	

}
