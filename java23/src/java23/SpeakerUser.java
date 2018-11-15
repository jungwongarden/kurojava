package java23;

public class SpeakerUser {

	public static void main(String[] args) {
		AppleSpeaker apple = new AppleSpeaker();
		apple.color = "빨강";
		apple.soundSize = 20;
		apple.shape = "사과모양";
		
		System.out.println(apple);
		apple.soundUp();
		apple.soundDown();
		apple.light();
		
		BananaSpeaker banana = new BananaSpeaker();
		banana.color = "노랑색";
		banana.maxSoundSize = 30;
		banana.soundSize  = 10;
		
		System.out.println(banana);
		banana.soundUp();
		banana.soundDown();
		banana.voice();
		
		
		
		
		
		
		
		
	}
}
