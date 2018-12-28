package java23;

public class BananaSpeaker extends Speaker{
	int maxSoundSize;
	public void voice() {
		System.out.println("음성인식하다.");
	}
	
	@Override
	public String toString() {
		return "BananaSpeaker [maxSoundSize=" + maxSoundSize + ", soundSize=" + soundSize + ", color=" + color + "]";
	}
	
	
}
