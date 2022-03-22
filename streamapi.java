import java.awt.print.Printable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamapi {

	public static void main(String[] args) {

//		  List<String> mylist = Arrays.asList("Cat","Dogs","Horse");
//		  mylist.stream().forEach(System.out::println);
//		  mylist.stream().map(str -> str.length()).forEach(System.out::println);
//
//		List<String> cities = Arrays.asList("Pune", "Mumbai", "Chennai", "Bangalore", "Noida");
//		System.out.println("Elements of list are");
//		cities.stream().forEach(System.out::println);
//
//		System.out.print("Cities greater than length 5: ");
//		cities.stream().filter(c -> c.length() > 5).forEach(System.out::println);
//		System.out.print("Cities lesser than length 5: ");
//		cities.stream().filter(c -> c.length() < 5).forEach(System.out::println);
//		System.out.print("Corresponding length of all cities: ");
//		cities.stream().map(str -> str.length()).forEach(System.out::println);
//		List<Integer> numbers = Arrays.asList(5, 7, 13, 9, 1);
//		numbers.stream().forEach(System.out::println); //print list elements.
//		System.out.println(numbers.stream().filter(c -> c > 3).sorted().findFirst().get()); //min value after removing all values lesser than 3.
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		List<String> courses = List.of("Spring","Spring Boot", "API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		/*
		 * int res = numbers.stream().filter(n -> n%2!=0) .reduce(0, Integer::sum);
		 * System.out.println(res);
		 */
		numbers.stream().distinct().forEach(System.out::println); //distinct numbers
		numbers.stream().distinct().sorted().forEach(System.out::println); //sorted ascending
		numbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println); //sorted descending
		
		courses.stream().distinct().sorted().forEach(System.out::println); //sorted ascending
		courses.stream().sorted(Comparator.comparing(str -> str.toString().length())).forEach(System.out::println); //sorted according to length(custom sorting)
		
		List<Integer> eveNums = new ArrayList<>();
		eveNums = numbers.stream().filter(x -> x%2==0).collect(Collectors.toList()); //even numbers collected from list and stored in a new list
		System.out.println(eveNums);
		
		List<Integer> lengths = new ArrayList<>();  
		lengths=courses.stream().map(l->l.length()).collect(Collectors.toList()); //list of lenght of course titles collected and sotred in a new list
		System.out.println(lengths);
		
		System.out.println(Stream.of(1,2,3,4,5,6,7,8));
		int[] numArr = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.stream(numArr));
		Arrays.stream(numArr).skip(4).forEach(System.out::println);
		
		System.out.println(IntStream.range(1, 11).sum()); //55 the end range is exclusive 
		System.out.println(IntStream.rangeClosed(1, 10).sum()); //55 the end range is inclusive
		System.out.println();
		
		System.out.println(IntStream.iterate(2, x -> x+2).limit(10).peek(System.out::println).sum()); //peek and print sum of first 10 even numbers 
		
		System.out.println(IntStream.iterate(2, x -> x+2).limit(10).boxed().collect(Collectors.toList())); //convert the intstream into list of integers using "boxed()" 
		
		
	
	}

}
