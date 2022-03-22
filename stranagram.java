import java.util.Arrays;

public class stranagram {

	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		boolean flag=false;
		if(s1.length()!=s2.length()) {
			flag=false;
		}
		else {
			char[] c1=s1.toLowerCase().toCharArray();
			char[] c2=s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			flag=Arrays.equals(c1, c2);
		}
		if(flag) {
			
			System.out.println("String is anagram");
		}
		else {
			System.out.println("string is not an anagram");
		}

	}

}
