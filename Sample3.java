import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Person {

	private String name;

	private int age;

	public Person(String name, int age) {

		this.name = name;

		this.age = age;

	}

	public void setName(String name) {

		this.name = name;

	}

	public void setAge(int age) {

		this.age = age;

	}

	public String getName() {

		return name;

	}

	public int getAge() {

		return age;

	}

}

class StreamImplementation {

	public int summationOfAge(List<Person> list) {

		int ageSum = list.stream().map(Person::getAge).filter(age -> age > 50).reduce(0, Integer::sum);

		return ageSum;

	}

	public List<String> getPersonName(List<Person> list) {

		List<String> names = new ArrayList<String>();

		names = list.stream().map(Person::getName).collect(Collectors.toList());

		return names;

	}

	public List<Integer> getPersonAge(List<Person> list) {

		List<Integer> ages = new ArrayList<Integer>();

		ages = list.stream().map(Person::getAge).collect(Collectors.toList());

		return ages;

	}

}

public class Sample3 {
	public static void main(String[] args) {
		List<Person> users = new ArrayList<>();

		users.add(new Person("Perry", 20));

		users.add(new Person("Ferry", 52));

		users.add(new Person("Katty", 100));

		users.add(new Person("Elly", 14));
		StreamImplementation obj = new StreamImplementation();

		System.out.println(obj.summationOfAge(users));

		System.out.println(obj.getPersonName(users));

		System.out.println(obj.getPersonAge(users));
	}
}
