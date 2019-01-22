package shop;

public class AClass {

	public static void main(String[] args) {
		BClass b = new BClass();
		String id = "root";
		String pw = "1234";
		String name = "admin";
		String tel = "011";
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setTel(tel);
		
		b.print(dto);
	}

}
