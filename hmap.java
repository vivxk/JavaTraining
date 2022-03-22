import java.util.HashMap;

public class hmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Vishal", 10);
		map.put("Sachin", 20);
		map.put("Vaibhav", 30);
		System.out.println("Size of map is: " + map.size());
		System.out.println("Elements of map are :" + map);
		if (!map.containsKey("Vishal")) {
			System.out.println("Vishal not present in records");
		} else {
			System.out.println(map.get("Vishal"));
		}
		map.get
	}

}
