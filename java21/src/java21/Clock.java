package java21;

public class Clock {
	int price;
	String name;
	int nowTime;
	String company;
	public Clock() {
		// TODO Auto-generated constructor stub
	}
	//알트+쉬프트+s+o (생성자 단축키)
	public Clock(int price, String company) {
		this.price = price;
		this.company = company;
	}
	public Clock(int price, int nowTime, String company) {
		this.price = price;
		this.nowTime = nowTime;
		this.company = company;
	}
	public Clock(int price, String name, int nowTime, String company) {
		this.price = price;
		this.name = name;
		this.nowTime = nowTime;
		this.company = company;
	}
	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Clock [price=" + price + ", name=" + name + ", nowTime=" + nowTime + ", company=" + company + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
