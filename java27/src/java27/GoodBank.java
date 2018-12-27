package java27;

public class GoodBank extends Bank {
	double rate;

	public GoodBank(int money, String location, double rate) {
		super(money, location);
		this.rate = rate;
	}
}
