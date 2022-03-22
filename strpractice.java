import java.util.Scanner;

public class strpractice {

	public static void main(String[] args) {
		String A = "";
		String B = "";
		try (Scanner sc = new Scanner(System.in)) {
			A = sc.nextLine();
			B = sc.nextLine();
		}
		int sum = 0;
		sum = A.length() + B.length();
		System.out.println(sum);
		if (A.compareTo(B) == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.print(A.replaceFirst("[a-z]{1}", "H"));
		System.out.print(" ");
		System.out.println(B.replaceFirst("[a-z]{1}", ""));
	}

}
