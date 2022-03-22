import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrlstanimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> animals = new ArrayList<String>(Arrays.asList("cat", "dog", "cow"));
		System.out.println("Original list: " + animals);
		System.out.print("Element at index 1: ");
		System.out.println(animals.get(1));
		animals.set(2, "horse");
		System.out.print("List after updating index 2 to horse: ");
		System.out.println(animals);
		Collections.sort(animals);
		System.out.print("List after sorting: ");
		System.out.println(animals);
		System.out.println("Index of cat: " + animals.indexOf("cat"));
		System.out.println("size of the list = " + animals.size());
		System.out.println("Sublist from index 0 to 1: " + animals.subList(0, 1));
		animals.clear();
		System.out.println("List after deletion: " + animals);

	}

}
