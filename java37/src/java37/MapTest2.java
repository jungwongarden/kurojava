package java37;

import java.util.HashMap;

public class MapTest2 {

	public static void main(String[] args) {
		HashMap students = new HashMap();
		Student s1 = new Student("kim", 21, "011");
		Student s2 = new Student("park", 22, "012");
		Student s3 = new Student("lee", 23, "013");
		
		students.put(100, s1);
		students.put(200, s2);
		students.put(300, s3);
		
		Student s11 = (Student)students.get(100);
		System.out.println(students);
		System.out.println(s11);
	}
}
