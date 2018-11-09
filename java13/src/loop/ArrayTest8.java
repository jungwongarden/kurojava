package loop;

public class ArrayTest8 {

	public static void main(String[] args) {
		int[][] num = new int[2][];
		
		num[0] = new int[2];// 1행의 열을 2개로 결정
		
		num[1] = new int[3]; //2행의 열을 3개로 결정
		num[0][0] = 1; //할당된 주소이므로 에러 발생하지 않음.
		
		System.out.println(num[0][0]);
		
	}

}
