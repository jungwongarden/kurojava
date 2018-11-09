package java16;

public class ArrayTest7 {

	public static void main(String[] args) {
		int[] num = {66, 77, 88, 99};
		
		
		//1.66을 옮겨라!
		int imsi = num[0];
		
		//2. num[0] < =99
		num[0] = num[3];
		
		//3. num[3] <= imsi
		num[3] = imsi;
		
		for (int x : num) {
			System.out.print(x + " ");
		}
	}

}
