import java.util.Arrays;

//find one extra char in strings method1- by sorting strings
public class strprac6 {

	public static void main(String[] args) {
		/*
		 * String string = "abada"; String string2 = "abadae"; char[] s =
		 * string.toCharArray(); char[] s2 = string2.toCharArray(); char diff = 0;
		 * Arrays.sort(s); Arrays.sort(s2); for (int i = 0; i < s.length; i++) { for
		 * (int j = 0; j < s2.length; j++) { if (s[i] != s2[j]) { diff = s2[j]; } else {
		 * continue; } } } System.out.println(diff);
		 */
		
		/*
		 * method2-using bitwise XOR 
		 * String string = "abada"; String string2 = "abadae"; int res = 0; for (int i =
		 * 0; i < string.length(); i++) { res = res ^ string.charAt(i) ^
		 * string2.charAt(i); res = res ^ string2.charAt(string.length()); }
		 * System.out.println((char) res);
		 */
	}

}
