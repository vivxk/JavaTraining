import java.util.Arrays;

class IdentifyWords {
	public String getPossibleWords(String s1, String s2) {
		String str[] = s2.split(":");
		String found[] = new String[str.length - 1];
		for (int i = 0; i < str.length; i++) {
			if (str[i].charAt(0) == s1.charAt(0) && str[i].charAt(str[i].length() - 1) == s1.charAt(s1.length() - 1)) {
				found[i] = str[i];
				continue;

			}
		}
//		for(int i=0;i<found.length;i++) {
//			if(found[i]==null) {
//				found[i]
//			}
//		}
		
		String foundstr = Arrays.toString(found);
		StringBuilder sb = new StringBuilder(foundstr);
//		System.out.println(found[1]);
		sb.deleteCharAt(0);
		sb.deleteCharAt(sb.length() - 1);
		String finalstr = sb.toString().replaceAll(", ", ":");
		return finalstr.toUpperCase();
	}
}

public class strprac10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdentifyWords i = new IdentifyWords();
		System.out.println(i.getPossibleWords("r_n", "run:sun:rsn:tsn"));

	}
}
