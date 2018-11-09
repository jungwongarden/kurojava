package java15;

import java.util.Scanner;

public class ArrayTest8 {
	
	public static void main(String[] args) {
		String[] name = new String[5];  //이름
		int[] grade = new int[5]; //학년
		char[] result = new char[5]; //성적
				
		//갯수를 count할 별도의 배열!
		int[] gCount = new int[4]; //1~4
		int[] rCount = new int[5]; //A~F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적>>>> 이름\t학년\t학점을 입력하세요.");
		
		//-----------------------  입력
		for (int i = 0; i < 5; i++) {
			System.out.print("입력>>>> ");
			name[i] = sc.next();
			grade[i] = sc.nextInt();
			result[i] = sc.next().charAt(0);
			
			if(grade[i] == 1) {
				gCount[0]++;
			}else if(grade[i] == 2) {
				gCount[1]++;
			}else if(grade[i] == 3) {
				gCount[2]++;
			}else {
				gCount[3]++;
			}
			
			if(result[i] == 'A') {
				rCount[0]++;
			}else if(result[i] == 'B') {
				rCount[1]++;
			}else if(result[i] == 'C') {
				rCount[2]++;
			}else if(result[i] == 'D') {
				rCount[3]++;
			}else{
				rCount[4]++;
			}
		}//for
		
		//----------------------- 전체 명단 출력
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("전체 인원은 " + name.length + "명");
		System.out.println();
		
		System.out.println("전체 동아리 명단입니다.");
		System.out.println("---------------------------");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(	"이름: " + name[i] + ", "	 +
					"학년: " + grade[i] + ", " +
					"학점: " + result[i]
					);
		}//for
		
		System.out.println();
		
		//----------------------- 학년별 인원 수 출력
		for (int i = 0; i < gCount.length; i++) {
			System.out.println(i+1 + "학년: " + gCount[i] + "명");
		}
		
		System.out.println();
		//----------------------- 학점별 인원 수 출력
		for (int i = 0; i < rCount.length; i++) {
			if(i == 4 ) {
				System.out.println("F학점: " + rCount[i] + "명");
			}else {
				System.out.println((char)('A' + i) + "학점: " + rCount[i] + "명");
			}
		}
		
		//----------------------- 이름의 위치 출력
		System.out.println();
		System.out.print("위치를 찾고 싶은 이름 입력>> ");
		String input = sc.next();
		for (int j = 0; j < name.length; j++) {
			if(input.equals(name[j])) {
				System.out.println("입력한 이름 " + input + "의 위치는 " + j );
			}
		}
		
		//----------------------- 이름을 입력 받아 관련 정보 출력
		System.out.println();
		System.out.print("정보를 알고 싶은 이름 입력>> ");
		String input2 = sc.next();
		for (int j = 0; j < name.length; j++) {
			if(input2.equals(name[j])) {
				System.out.println("입력한 이름 " + input2 + "의 위치는 " + j );
				System.out.println("입력한 이름의 학년은 " + grade[j]);
				System.out.println("입력한 이름의 학점은 " + result[j]);
			}
		}
		
	}//main
}//class


