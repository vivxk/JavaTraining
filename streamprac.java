import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class People {
	private int age;
	private Gender gender;

	public enum Gender {
		MAN, WOMEN
	}

	private String name;

	public People(String name, int age, People.Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}

class PeopleImplementation {
	public int minimumAgeContainingE(Collection<People> peoples) {
//		int minAge = peoples.stream().filter(x -> x.getName().matches(".*[e|E].*")).map(People::getAge).sorted().findFirst()
//				.get();
		int minAge = peoples.stream().filter(x -> x.getName().contains("e")).map(People::getAge).sorted().findFirst()
				.get();

		return minAge;

	}

	public int getAgeOfOldestMan(Collection<People> peoples) {
		int age = 0;
		List<Integer> ages = peoples.stream().filter(x -> x.getGender().name().toString().equals("MAN"))
				.map(People::getAge).sorted().collect(Collectors.toList());
		return ages.get(ages.size()-1);
//		Collections.reverse(ages);
//		age = ages.get(0);
//		return ages.get(0);
	}

}

public class streamprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<People> peoples = Arrays.asList(new People("Vivek", 21, People.Gender.MAN),
				new People("Ram", 41, People.Gender.MAN), new People("Serah", 29, People.Gender.WOMEN),
				new People("Jean", 13, People.Gender.WOMEN));
		PeopleImplementation peopleImplementation = new PeopleImplementation();
		System.out.println(peopleImplementation.minimumAgeContainingE(peoples));
		System.out.println(peopleImplementation.getAgeOfOldestMan(peoples));

	}

}
