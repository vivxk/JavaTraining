import java.util.LinkedList;

class addresses {
	String name, street, city, state;
	int code;

	public addresses(String name, String street, String city, String state, int code) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.code = code;
	}

}

public class sets {

	public static void main(String[] args) {
		LinkedList<addresses> ll = new LinkedList<addresses>();
		addresses a1 = new addresses("Tom", "bakerstreet", "london", "uk", 123);
		addresses a2 = new addresses("James", "Street11", "boston", "US", 1234);
		addresses a3 = new addresses("Raj", "Street21", "Delhi", "Delhi", 12345);
		ll.add(a1);
		ll.add(a2);
		ll.add(a3);
		System.out.print("Original List is: ");
		for (addresses a : ll) {
			System.out.println(a.name + " " + a.street + " " + a.city + " " + a.state + " " + a.code);
		}
		System.out.print("City of person with name Tom is: ");
		for (addresses a : ll) {
			if (a.name.equalsIgnoreCase("Tom"))
				System.out.println(a.city);

		}
		System.out.print("Person with city delhi is: ");
		for (addresses a : ll) {
			if (a.city.equalsIgnoreCase("Delhi"))
				System.out.println(a.name);
		}
		LinkedList<addresses> ll1 = new LinkedList<addresses>();
		ll1.add(new addresses("Rishabh", "Street56", "Gurgaon", "Haryana", 12));
		ll1.add(new addresses("Deepak", "Street58", "Noida", "UP", 567));
		System.out.print("New List is: ");
		for (addresses a : ll1) {
			System.out.println(a.name + " " + a.street + " " + a.city + " " + a.state + " " + a.code);
		}
		ll.addAll(ll1);
		System.out.print("Merged list is: ");
		for (addresses a : ll) {
			System.out.println(a.name + " " + a.street + " " + a.city + " " + a.state + " " + a.code);
		}
		System.out.print("Street of person with code 567 is: ");
		for (addresses a : ll) {
			if (a.code == 567) {
				System.out.println(a.street);
			}

		}
	}
}