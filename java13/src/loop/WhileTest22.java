package loop;

public class WhileTest22 {

	public static void main(String[] args) {
		int count = 0, realCount = 0;
		int sum = 0;
		while (count < 5) {
			System.out.println("여기 들어왔어.i: " + count);
			if(count == 2) {
				System.out.println("나는 2라서 나는 스킵할거야..======");
				System.out.println();
				count++;
				continue;
			}
			sum = sum + count;
			count++;
			realCount++;
			System.out.println("2: " + sum);
			System.out.println();
		}
		System.out.println("3: " + sum);
		System.out.println("전체 반복문 횟수는: " +realCount+"회");
	}
}
