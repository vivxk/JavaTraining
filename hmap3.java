import java.util.HashMap;

public class hmap3 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		System.out.println(map);
		map.putIfAbsent(103, "Gaurav");
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(104, "Ravi");
		map1.put(105, "Rohit");
		System.out.println("Another list: " + map1);
		map.putAll(map1);
		System.out.println("Map after merging: " + map);
		map.replace(102, "Gaurav");
		System.out.println("Map after replacing: " + map);
		System.out.println(map.values());
		
	}

}
