class Implementation {
	public String spotCapitals(String word) {
		boolean caps = true;
		
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(0)) || Character.isUpperCase(word.charAt(i))) {
				caps = true;

			} else {
				caps = false;

			}
		}
		if (caps) {

			return "Correct";
		} else {
			return "Incorrect";
		}

	}
}

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementation i = new Implementation();
		System.out.println(i.spotCapitals("CODER"));
		/*
		 * String s = "CODER"; System.out.println(Character.isUpperCase(s.charAt(0)));
		 */
	}

}
