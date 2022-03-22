import java.util.Scanner;
import java.util.regex.Pattern;

public class regex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mobile;
		mobile = sc.next();
		sc.close();
		try {
			if (Pattern.matches("[6-9]{4}\\d{6}", mobile)) {
				System.out.println("Valid Number");
			} else {
				throw new InvalidMobileException("Invalid mobile no!");
			}
		} catch (InvalidMobileException e) {
			System.out.println(e.msg);
		}

	}
}

class InvalidMobileException extends Exception {
	String msg;

	public InvalidMobileException(String msg) {
		this.msg = msg;
	}

}
