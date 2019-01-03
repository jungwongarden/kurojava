package bean;

public class MainClass {

	public static void main(String[] args) throws Exception {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		dto.setId("win");
		dto.setPw("win");
		dto.setName("win");
		dto.setTel("win");
		
		dao.insert(dto);
	}

}
