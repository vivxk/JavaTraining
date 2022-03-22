import java.util.Scanner;
import java.util.regex.Pattern;

public class colorLMS {

	public static void main(String[] args) {

		String hex = "#ABCDEF";
		String decimal = "rgb(256,255,255)";
		int inp;
		Scanner sc = new Scanner(System.in);
		inp = sc.nextInt();
		sc.close();
		if (inp == 1) {
			int res = colorLMS.validateHexCode(hex);
			if(res==1) {
				System.out.println("Valid Code");
			}
			else {
				System.out.println("Invalid Code");
			}
			
		} 
		else if (inp == 2) {
			int res = colorLMS.validateDecimalCode(decimal);
			if(res==1) {
				System.out.println("Valid Code");
			}
			else {
				System.out.println("Invalid Code");
			}
		} else {
			System.err.println("Invalid Choice");
		}
	}
	public static int validateHexCode(String hex) {
		if (Pattern.matches("^#([A-F]|[0-9]){6}", hex))
			return 1;
		else
			return -1;

	}
	public static int validateDecimalCode(String decimal) {
		if (Pattern.matches("(rgb)\\((\\b([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]),\\b([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]),\\b([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]))\\)", decimal))
			return 1;
		else
			return -1;

	}

}
