import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Reverse of a string.
public class HelloWorld {
	public static void main(String[] args) {
		String s = "Amit Rai@1PC1CS046-ALU#8";
		/*
		 * String name = s.replaceAll("@.*", ""); System.out.println(name);
		 */
		/*
		 * String clg = s.replaceAll(".*-", ""); System.out.println(clg);
		 */
		System.out.println(s);
		Pattern pattern1 = Pattern.compile("(^[\\w\\s]*)");
		Matcher matcher1 = pattern1.matcher(s);
		if (matcher1.find()) {
			System.out.println(matcher1.group());
		}
		
		Pattern pattern = Pattern.compile("([A-Z]{3})");
		Matcher matcher = pattern.matcher(s);
		if (matcher.find()) {
			System.out.println(matcher.group());
		}
		Pattern pattern2 = Pattern.compile("([0-9A-Z]{9})");
		Matcher matcher2 = pattern2.matcher(s);
		if (matcher2.find()) {
			System.out.println(matcher2.group());
		}

		Pattern pattern3 = Pattern.compile("([0-9]{3})");
		Matcher matcher3 = pattern3.matcher(s);
		if (matcher3.find()) {
			System.out.println(matcher3.group());
		}
		Pattern pattern4 = Pattern.compile("([0-9]$)");
		Matcher matcher4 = pattern4.matcher(s);
		if (matcher4.find()) {
			System.out.println(matcher4.group());
		}
	}
}
