package java26;

public class PrintMain {
	public void print(Member m) {
		System.out.println("당신이 입력한 정보를 확인해주세요...");
		System.out.println("--------------------------");
		System.out.println("당신의 ID: " + m.getId());
		System.out.println("당신의 PW: " + m.getPw());
		System.out.println("당신의 NAME: " + m.getName());
		System.out.println("당신의 AGE: " + m.getAge());
	}
}
