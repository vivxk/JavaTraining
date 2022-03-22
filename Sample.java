import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;

class Product {

	ArrayList<String> productList = new ArrayList<String>();

	void addProduct(String pName) {

		productList.add(pName);
	}

	void removeProduct(String pName) {
		productList.remove(pName);
	}

	int uniqueProduct() {
		
		return (int) productList.stream().distinct().count();

	}

}
public class Sample {

	public static void main(String args[]) throws Exception {
		Product p1 = new Product();
		p1.addProduct("Pen");
		p1.addProduct("Shirt");
		p1.removeProduct("Shirt");
		p1.addProduct("Pen");
		int count=p1.uniqueProduct();
		System.out.println(count);
		
	}

}