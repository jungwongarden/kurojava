package com.itbank.mvc1;

public class AppleSpeaker implements Speaker {
	String color;
	int size;
	//인터페이스 추출
	//알트+쉬프트+T+E
	public void soundUp(){
		System.out.println("애플스피커 사운드업");
	}
	public void soundDown(){
		System.out.println("애플스피커 사운드다운");
	}
}
