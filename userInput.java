import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // create scanner object
		System.out.println("Enter number");
		int a = sc.nextInt();
		sc.close();
		int b = a + 10;
		System.out.println("Output is " + b);

	}

}
