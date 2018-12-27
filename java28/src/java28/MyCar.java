package java28;

public class MyCar {
	public MyCar() {
		m(new Speaker() {
			@Override
			public void soundUp() {
				System.out.println("내 스피커에서 영화음악이 크게 나와요.");
			}
			
			@Override
			public void soundDown() {
				System.out.println("내 스피커에서 영화음악이 작게 나와요.");
			}
		});
	}
	public void m(Speaker s) {
		s.soundUp();
		s.soundDown();
	}
}


