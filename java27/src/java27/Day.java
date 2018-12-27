package java27;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum;
	
	public Day(String doing, int time, String location) {
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	public static int getCount() {
		return count;
	}
	
	public static int getSum() {
		return sum;
	}
	

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
	
}
