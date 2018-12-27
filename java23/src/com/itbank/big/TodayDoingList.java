package com.itbank.big;

public class TodayDoingList {

	public static void main(String[] args) {
		TodayDoing do1 = new TodayDoing("자바", 5, "5층 강의실");
		TodayDoing do2 = new TodayDoing("JSP", 3, "4층 강의실");
		TodayDoing do3 = new TodayDoing("스프링", 2, "3층 강의실");
		
		System.out.println("오늘의 해야할 일");
		System.out.println("-------------------------");
		System.out.println("항목\t 시간\t 장소");
		System.out.println("-------------------------");
		
		System.out.println(do1.title + "\t" + do1.time + "\t" + do1.location);
		System.out.println(do2.title + "\t" + do2.time + "\t" + do2.location);
		System.out.println(do3.title + "\t" + do3.time + "\t" + do3.location);
		
		System.out.println("-------------------------");
		System.out.println("총시간: " + (do1.time + do2.time  + do3.time) + "시간");
	}

}
