package 배열;

public class Seat {

	public static void main(String[] args) {
		int[] seat = new int[10];
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		//5, 6번자리 예매처리
		//0->1로 저장.
		seat[5] = 1;
		seat[6] = 1;
		System.out.println("\n------------------");
		
		for (int i = 0; i < seat.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//모든 자리 상황 프린트
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
	}
}
