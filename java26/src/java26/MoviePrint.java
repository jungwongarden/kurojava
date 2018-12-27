package java26;

public class MoviePrint {
//	String id;
//	String name;
//	
//	public MoviePrint(Movie m) {
//		id = m.getId();
//		name = m.getName();
//		System.out.println(id + " " +  name);
//	}


	public  void print(Movie m) {
//	public static void print(Movie m) {
		System.out.println("당신이 예약한 정보를 확인해주세요...");
		System.out.println("--------------------------");
		System.out.println("당신의 ID: " + m.getId());
		System.out.println("당신의 NAME: " + m.getName());
		System.out.println("당신의 TEL: " + m.getTel());
		System.out.println("영화의 상영시간: " + m.getHour());
		System.out.println("영화 좌석번호: " + m.getSeat());
	}
}
