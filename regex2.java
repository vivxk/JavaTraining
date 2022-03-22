import java.util.Scanner;
import java.util.regex.Pattern;

public class regex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email;
		email = sc.next();
		sc.close();
		try {
			if (Pattern.matches("\\w*@[a-zA-Z]*\\.com", email)) { // \w is same as [a-zA-Z_0-9], escaping the "." character in ".com" 
				System.out.println("Valid email");
			} else {
				throw new InvalidEmailException(email + " is an Invalid Email!");
			}
		} catch (InvalidEmailException e) {
			System.out.println(e.msg);
		}

	}

}

class InvalidEmailException extends Exception {
	String msg;

	public InvalidEmailException(String msg) {
		this.msg = msg;
	}

}