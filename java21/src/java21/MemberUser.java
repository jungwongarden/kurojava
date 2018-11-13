package java21;

public class MemberUser {

	public static void main(String[] args) {
		
		Member mem1 = new Member();
		mem1.mil = 1000;	mem1.id = "admin";
		mem1.pw = "1234";
		mem1.level = "관리자";
		
		Member mem2 = new Member();
		mem2.id = "manager";
		mem2.pw = "pass";
		mem2.level = "준관리자";
		mem2.mil = 1500;
		
		
		Member mem3 = 
				new Member("siteManager", "sitepass", "준관리자", 1800);
		
		System.out.println("mem3" + mem3);
		
		
		
		
		
		
	}

}
