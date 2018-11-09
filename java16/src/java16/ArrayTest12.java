package java16;

import java.util.Random;

public class ArrayTest12 {

 public static void main(String[] args) {
  
  Random r = new Random();
  
  //패스워드 배열 생성
  char[] pw = new char[8];
  //패스워드 위치별 아스키코드 조절 배열 선언
  int[] num = {33, 97, 49, 33, 97, 49, 33, 97};
  
  System.out.println(pw);
  
  System.out.println(num);
  
  //pw배열 각 인덱스에 랜덤한 char값 생성 후 password에 추가연산
  for (int j = 0; j < 3; j++) { 
   for (int i = 0; i < pw.length; i++) {
    pw[i] = (char) (r.nextInt(10) + num[i]);
   }
   System.out.println(pw);
  } 
 }
}