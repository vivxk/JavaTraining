import java.util.Scanner;

public class excep3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String username = sc.nextLine();
		System.out.print("Enter password: ");
		String password = sc.nextLine();
		sc.close();
		try {
			if (username.contains("capgemini") && password.contains("1")) {
				System.out.println("Valid user!");
			} else {
				throw new InvalidUserException("Invalid User!");
			}
		} catch (InvalidUserException e) {
			System.out.println(e.getMessage());
		}
	}

}

class InvalidUserException extends Exception {

	public InvalidUserException(String s) {
		super(s);

	}
}