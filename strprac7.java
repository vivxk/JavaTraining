//Check if a string is palindrome
public class strprac7 {

	public static void main(String[] args) {
		String string = "racecar";
		/*
		 * 1st approach using reverse() methods in StringBuilder
		 */

		/*
		 * StringBuilder sb = new StringBuilder(string); sb.reverse(); if
		 * (sb.toString().equals(string)) System.out.println("String is palindrome");
		 * else System.out.println("not a palindrome");
		 */

		/*
		 * 2nd approach using two indicators/pointers start & end
		 */

		/*
		 * int start = 0; int end = string.length() - 1; boolean isPalindrome = true;
		 * while (start < end) { if (string.charAt(start) != string.charAt(end)) {
		 * isPalindrome = false; break; } start++; end--;
		 * 
		 * } if (isPalindrome) System.out.println("String is palindrome"); else {
		 * System.out.println("String is not a palindrome"); }
		 */
	}
}