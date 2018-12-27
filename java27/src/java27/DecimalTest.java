package java27;

import java.text.DecimalFormat;

public class DecimalTest {

	public static void main(String[] args) {
		double d = -123.456;

		DecimalFormat format = new DecimalFormat("#,###.##");
		System.out.println(format.format(d));
	}
}
