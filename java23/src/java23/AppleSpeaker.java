package java23;

public class AppleSpeaker extends Speaker{
	String shape;
	public void light() {
		System.out.println("불빛이 번쩍이다.");
	}
	@Override
	public String toString() {
		return "AppleSpeaker [shape=" + shape + ", soundSize=" + soundSize + ", color=" + color + "]";
	}
}
