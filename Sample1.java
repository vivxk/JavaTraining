import java.util.regex.Pattern;

class Customer {

	// Write Your Code Here..

	String name;

	String mobileNo;

	String customerID;

	public Customer(String name, String mobileNo, String customerID) {

		this.name = name;

		this.mobileNo = mobileNo;

		this.customerID = customerID;

	}

}

class Validator {

	// Write Your Code Here..

	public String validateCustomerID(Customer c) throws Exception {

		String custID = c.customerID;

		char lastchar = c.name.charAt(c.name.length() - 1);

		char secondlastchar = c.name.charAt(c.name.length() - 2);

		String finalStr = Character.toString(secondlastchar) + Character.toString(lastchar);

		char[] p = new char[4];

		for (int i = 0; i < 4; i++) {

			p[i] = c.mobileNo.charAt(i);

		}

		String pstr = String.valueOf(p);

		if (Pattern.matches(pstr + finalStr, custID)) {

			return "Valid CId";

		}

		else {

			throw new InvalidCustomerIDException("Invalid customerID");

		}

	}

	public String validateMobileNo(Customer c) throws Exception {

		if (Pattern.matches("[6-9]\\d{9}", c.mobileNo)) {

			return "Valid MobileNo";

		}

		else {

			throw new InvalidMobileNoException("Invalid MobileNo");

		}

	}

}

class InvalidCustomerIDException extends Exception {

	// Write Your Code Here..

	public InvalidCustomerIDException(String msg) {

		super(msg);

	}

}

class InvalidMobileNoException extends Exception {

	public InvalidMobileNoException(String msg) {

		super(msg);

	}

	// Write Your Code Here..

}

public class Sample1 {

	public static void main(String args[]) throws Exception {

		/* Enter your code here. Read input from STDIN. Print output to STDOUT */

		Customer obj = new Customer("Steve", "9898111111", "9898ve");

		Validator val = new Validator();

		try {

			String CID = val.validateCustomerID(obj);

			System.out.println("CID = " + CID);

		} catch (InvalidCustomerIDException e) {
		}

		try {

			String mob = val.validateMobileNo(obj);

			System.out.println("mob = " + mob);

		} catch (InvalidMobileNoException e) {

		}

	}

}