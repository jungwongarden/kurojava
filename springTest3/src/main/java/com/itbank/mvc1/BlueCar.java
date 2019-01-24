package com.itbank.mvc1;

import javafx.scene.control.Separator;

public class BlueCar {
	//AppleSpeaker speaker;
	
	BananaSpeaker speaker;
	
	public BlueCar(BananaSpeaker speaker) {
		this.speaker = speaker;
	}


	public void soundUp(){
		//speaker.soundUp();
		speaker.volumeUp();
	}
}
