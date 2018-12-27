package java30;

public class Car {
	Speaker s;
	Window w;
	
	public Car(Speaker s, Window w) {
		this.s = s;
		this.w = w;
	}

	public void info() {
		s.soundUp();
		s.soundDown();
		w.open();
		w.close();
	}

	public Car(Speaker s) {
		this.s = s;
	}
	
	
	
	
	
	
}
