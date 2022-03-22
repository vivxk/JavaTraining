import java.util.ArrayList;
import java.util.Arrays;

public class intarrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		for (Integer i : list) {
			System.out.println(i);
		}
		list.remove(3);
		System.out.println("list after removing index 3: ");
		for (Integer i : list) {
			System.out.println(i);
		}

		if (!list.contains(4)) { // check if 4 is present in list or not
			System.out.println("4 is not present in list");
		} else {
			System.out.println("4 is present in list");
		}

		ArrayList<Integer> newlist = new ArrayList<Integer>(Arrays.asList(2, 3, 5));
		if (!list.containsAll(newlist)) {
			System.out.println("old list is not same as new list");
		} else {
			System.out.println("old list is same as new list");
		}

		list.addAll(newlist);
		System.out.println("List after adding new list: ");
		for (Integer i : list) {
			System.out.println(i);
		}
		list.remove(0);
		System.out.println("list after removing 1: ");
		for (Integer i : list) {
			System.out.println(i);
		}

	}

}
