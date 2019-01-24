package com.itbank.mvc1;

public class LemonSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("레몬스피커 사운드 업");
	}

	@Override
	public void soundDown() {
		System.out.println("레몬스피커 사운드 다운");
	}

}
