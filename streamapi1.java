import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamapi1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh");
		/*
		 * System.out.print("Names of people starting with 'A': ");
		 * names.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);
		 * System.out.print("Names ending with 'r': "); names.stream().filter(x ->
		 * x.endsWith("r")).forEach(s -> System.out.println(s.toUpperCase()));
		 * System.out.println("Names starting with 'R'?: " + names.stream().anyMatch(x
		 * -> x.startsWith("R"))); System.out.println("All names starting with 'A'?: " +
		 * names.stream().allMatch(x -> x.startsWith("A")));
		 * System.out.println("No names starting with 'A'?: " +
		 * names.stream().noneMatch(x -> x.startsWith("A")));
		 * System.out.println("Count of names ending with 'r': " +
		 * names.stream().filter(x -> x.endsWith("r")).count());
		 * System.out.println(names.get(0));
		 */
		List<String> namesList = Arrays.asList("Akash", "Raj", "Vivek", "Varun");
		List<Integer> n = new ArrayList<Integer>();
		n = namesList.stream().filter(x -> x.startsWith("V")).collect(Collectors.toList()).stream().map(x -> x.length())
				.collect(Collectors.toList());
		System.out.println("Length of names starting with \"V\": " + n);
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		//		num.stream().collect(Collections.sort(num));
//		System.out.println(maxNum);
	}

}
