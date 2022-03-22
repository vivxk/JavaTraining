import java.util.*;

public class hmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		System.out.println("Original Map: " + map);
		map.replace(2, "NA");
		System.out.println("Map after updating two: " + map);
		map.remove(4);
		System.out.println("Map after removing key 4: " + map);
		System.out.print("Map using Iterator: ");
		Iterator itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println("Is the map empty? " + map.isEmpty());
		System.out.print("Values of the map are: " + map.values() + "\n");
		System.out.print("Keys of the map are: " + map.keySet() + "\n");
		if (map.containsValue("Three")) {
			System.out.println("Three is present in the map");
		} else {
			System.out.println("Three not present in the map");
		}
		System.out.println("Set view of the map is: " + map.entrySet());
		map.clear();
		System.out.println("Map after removing all mappings: " + map);
	}

}
