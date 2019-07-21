package 배열심화;

public class 최대값찾기 {

	public static void main(String[] args) {
		int[] num = { 77, 88, 99, 55, 22 };
		//비교해서 항상 그때까지의
		//최대값이 저장되도록 하는 변수
		int max = num[0];
		//for문으로 배열을 순회하면서
		//max값과 비교
		//배열의 값이 max값보다 크면
		//그 값을 max변수에 넣는다.
		//for문이 끝나면 max변수에는 
		//최대값만 남는다.
		for (int i = 0; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("최대값은 " + max);
	}

}
