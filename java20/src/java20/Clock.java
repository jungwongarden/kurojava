package java20;

public class Clock {
//	�떆怨�
//	- �젙�쟻�냽�꽦(�븘�뱶, �빆紐�, 硫ㅻ쾭蹂��닔)=> �쟾�뿭蹂��닔
//	  �깋, 紐⑥뼇
	String color;
	String shape;
	
//	- �룞�쟻�냽�꽦(硫붿냼�뱶)
//	  run(�쁽�옱源뚯� �옉�룞�맂 �떆媛�), 
//	  stop(�뼱�뵒�뿉 �엳�쓣�븣 硫덉텛�뿀�뒗吏� �옣�냼)
	public void run(int time) {
		System.out.println("�쁽�옱源뚯� �옉�룞�맂 �떆媛꾩� " + time);
	}
	
	public void stop(String location) {
		System.out.println("�떆怨꾧� " + location + "�뿉�꽌 硫덉텛�뿀�뒿�땲�떎.");
		
	}

	@Override
	public String toString() {
		return "Clock [color=" + color + ", shape=" + shape + "]";
	}
	
	
	
	
	
	
	
}
