package java26;

public class MovieMain {

	public static void main(String[] args) {
		Movie m = new Movie("root", "박아무개", "010-123", 8, 25);
		//MoviePrint.print(m);
		MoviePrint p = new MoviePrint();
		p.print(m);
		
	}

}
