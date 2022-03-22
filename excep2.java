import java.util.Scanner;

public class excep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		try {
			if (age >= 18) {
				System.out.println("You are allowed to vote!");
			} else {
				throw new InvalidAgeException();
			}
		} catch (InvalidAgeException e) {
			
		}
	}
}

class InvalidAgeException extends Exception {
//	String s;
	public InvalidAgeException() {
		System.out.print("Your age is not appropriate to vote!");
	}
}
