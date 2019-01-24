package com.itbank.mvc1;

public class MainClass2 {

	public static void main(String[] args) {
		Speaker speaker = new AppleSpeaker();
		BlueCar2 blue = new BlueCar2(speaker);
		blue.soundUp();
	}

}
