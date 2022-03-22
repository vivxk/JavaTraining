//Program to find if a string is pangram or not i.e, it contains all 26 letters of English alphabet
public class strprac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "The quick brown fox jumps over the lazy dog";
		String string2 = "abc def xyz";
		System.out.println(isPangram(string));
		System.out.println(isPangram(string2));
	}

	public static boolean isPangram(String str) {
		int n = str.length();
		if (n < 26) {
			return false;
		}
		boolean visited[] = new boolean[26];
		for (int i = 0; i < n; i++) {
			char x = str.charAt(i);
			if (x >= 'a' && x <= 'z') {
				visited[x - 'a'] = true;
			}
			if (x >= 'A' && x <= 'Z') {
				visited[x - 'A'] = true;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (visited[i] == false) {
				return false;
			}

		}
		return true;

	}
}
