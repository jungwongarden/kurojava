package java17;

public class ArrayTest1 {

	public static void main(String[] args) {
		String[][] names = new String[2][10];
		//2행: 0~1, 10열: 0~9
		names[0][0] = "손상혁";//첫 자리
		names[0][4] = "김대호";
		names[1][9] = "임아무개";//마지막 자리
		
		System.out.println("행의 갯수: " + names.length); 
		//2차원 배열에서 배열이름.length는 행의 갯수
		
		//바깥의  for문 행을 순회
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + "행");
			//안쪽의 for문 열을 순회
			System.out.println(names[i].length);
			for (int j = 0; j < names[i].length; j++) {
				System.out.println(names[i][j]);
			}
		}
		
		
	}

}
