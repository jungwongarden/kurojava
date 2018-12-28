import java.util.HashMap;
import java.util.Set;

public class KeyTest {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put(100, 100);
		m.put(200, 200);
		m.put(300, 300);
		Set s = m.keySet();
		Object[] o = s.toArray();
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
		
	}

}
