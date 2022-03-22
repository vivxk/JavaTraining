import java.util.*;

public class arrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("Grapes");
		System.out.println("using enhanced for loop: ");
		for (String s : list) {
			System.out.println(s);
		}
		list.set(0,"Strawberry");
		System.out.println("Using iterator: ");
		list.contains(list)

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) { // check whether iterator has next elements or not.
			System.out.println(iterator.next()); // prints next ele in iterator.
		}
		

	}

}
