import java.util.*;

public class hmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 1000);
		map.put("B", 2000);
		map.put("C", 3000);
		map.put("D", 4000);
		map.put("E", 5000);
//		System.out.println(map.entrySet());
		map.entrySet().forEach(m -> { // using lambda expr
			System.out.println(m.getKey() + "-" + m.getValue());
		});

		int bal = map.get("B").intValue();
		bal += 1000;
		map.replace("B", bal);
		System.out.println("Map after updating balance: ");
		map.entrySet().forEach(m -> { // using lambda expr
			System.out.println(m.getKey() + "-" + m.getValue());
		});

		
	}
}
