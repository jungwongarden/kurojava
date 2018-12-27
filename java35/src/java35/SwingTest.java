package java35;

public class SwingTest {

	public static void main(String[] args) throws Exception {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.select("win");
		System.out.println("반환받은 검색 결과 확인...");
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		System.out.println(dto.getName());
		System.out.println(dto.getTel());
	}
}
