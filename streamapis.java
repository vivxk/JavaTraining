import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streamapis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<candidate> candidates = new ArrayList<candidate>();
		candidates.add(new candidate("Ramesh", "Java", "Pune", 5));
		candidates.add(new candidate("Raman", "Java", "Banglore", 4));
		candidates.add(new candidate("Soumya", "C#", "Pune", 11));
		candidates.add(new candidate("Raghu", "Java", "Chennai", 3));
		candidates.add(new candidate("Pramod", "Java", "Mumbai", 1));
		candidates.add(new candidate("Trisha", "C#", "Pune", 0));
		candidates.add(new candidate("Nandan", "C++", "Chennai", 0));
		candidates.add(new candidate("Jeevan", "Java", "Mumbai", 1));
		candidates.add(new candidate("Priya", "Java", "Banglore", 11));
		candidates.add(new candidate("Priyanka", "C++", "Chennai", 4));
		
		List<candidate> puneCandidate = new ArrayList<candidate>();
		puneCandidate = candidates.stream().filter(x -> x.city.equals("Pune")).collect(Collectors.toList());
		puneCandidate.stream().forEach(System.out::println);
	
		List<candidate> freshers = new ArrayList<candidate>();
		freshers = candidates.stream().filter(x -> x.yof==0).collect(Collectors.toList());
		freshers.stream().forEach(c -> {System.out.println(c.name+" " + c.techExp+" " +c.city+" " +c.yof);
	});
	
		List<candidate> seniors = new ArrayList<candidate>();
		int maxexp = candidates.stream().map(x -> x.yof).reduce(0, (a,b) -> a>b?a:b);
		seniors = candidates.stream().filter(c -> c.yof==maxexp).collect(Collectors.toList());
		seniors.stream().forEach(c -> {System.out.println(c.name+" " + c.techExp+" " +c.city+" " +c.yof);
		});

		List<candidate> javaCandidates = new ArrayList<candidate>();
		javaCandidates = candidates.stream().filter(x -> x.techExp=="Java").map(c -> c.city).collect(Collectors.toList());
		javaCandidates.stream().forEach(c -> {System.out.println(c.city);});
	}
}









class candidate {
	String name, city, techExp;
	int yof;

	public candidate(String name, String techExp, String city, int yof) {
		this.name = name;
		this.city = city;
		this.techExp = techExp;
		this.yof = yof;
	}
}
