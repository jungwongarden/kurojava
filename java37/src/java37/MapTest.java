package java37;

import java.util.HashMap;


//map test2.
public class MapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(100, "kim");
		map.put(200, "park");
		map.put(300, "lee");
		map.put(400, "moon");
		
		System.out.println(map);
		String value = (String)map.get(100);
		System.out.println("100 아이디의 이름은 " + value);
	}
}
