package java36;

public class GenericTest3 {

	public static void main(String[] args) {
		MemberDTO dto = new MemberDTO();
		dto.setId("park");
		Box<MemberDTO> box = new Box<MemberDTO>(dto);
		System.out.println(dto.getId());
		
	}
}
