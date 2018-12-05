package java37;

public class Box2<X, Y> {
	
	X x;
	Y y;
	
	public Box2(X x, Y y) {
		super();
		this.x = x;
		this.y = y;
	}

	public X getX() {
		return x;
	}

	public void setX(X x) {
		this.x = x;
	}

	public Y getY() {
		return y;
	}

	public void setY(Y y) {
		this.y = y;
	}

	public X result() {
		System.out.println(getX());
		return getX();
	}
	
	
	
	
	@Override
	public String toString() {
		return "Box2 [x=" + x + ", y=" + y + "]";
	}
	
}
