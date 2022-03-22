import java.util.regex.Pattern;
//Pattern Searching
public class strprac8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "geeksforgeeks";
		String pat = "geeks";
		for (int i = 0; i < string.length() - pat.length() + 1; i++) {
			if (string.substring(i, i + pat.length()).equals(pat)) {
				System.out.println("pattern is present at: " + i);
			}
		}
		/* approach with methods
		 * System.out.println(string.indexOf(pat));
		 * System.out.println(string.lastIndexOf(pat));
		 */
	}

}
