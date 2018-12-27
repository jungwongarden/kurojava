package java36;

import java.util.ArrayList;

public class SwingTest {

	public static void main(String[] args) throws Exception {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.selectAll();
		System.out.println("전체 회원리스트입니다.");
		System.out.println("전체 회원은 " + list.size() + "명");
		System.out.println("----------------------------------");
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			MemberDTO dto = list.get(i);
			System.out.println("아이디: " + dto.getId());
			System.out.println("패스워드: " + dto.getPw());
			System.out.println("이름: " + dto.getName());
			System.out.println("연락처: " + dto.getTel());
			System.out.println();
		}
	}
}
