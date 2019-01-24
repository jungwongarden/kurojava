package com.itbank.mvc1;

public class MainClass {

	public static void main(String[] args) {
		//AppleSpeaker apple = new AppleSpeaker();
		BananaSpeaker banana = new BananaSpeaker();
		BlueCar blue = new BlueCar(banana);
		blue.soundUp();
	}

}
