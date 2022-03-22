import java.util.*;
//import java.util.function.Supplier;

public class itemclass {

	public static void main(String[] args) {
		item i = new item();
		i.setName("A");
		i.setPrice(10);
		item i2 = new item();
		i2.setName("B");
		i2.setPrice(20);

		List<item> list = new ArrayList<item>();
		list.add(i);
		list.add(i2);

		for (item it : list) {
			System.out.print("Name: " +it.getName());
			System.out.println(" Price: " + it.getPrice());
		}

}
}
class item {
	public String name;
	public int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
