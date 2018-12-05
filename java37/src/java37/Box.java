package java37;

public class Box<K, V> {
	K n1;
	V n2;

	public Box(K n1, V n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	@Override
	public String toString() {
		return "Box [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
	
}
