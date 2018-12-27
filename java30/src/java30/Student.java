package java30;

public class Student {
	String pw;
	String name;
	int height;
	String tel;

	public Student(String pw, String name, int height, String tel) {
		this.pw = pw;
		this.name = name;
		this.height = height;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Student [pw=" + pw + ", name=" + name + ", height=" + height + ", tel=" + tel + "]";
	}
	

}
