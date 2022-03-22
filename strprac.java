class StringPlay {
	int convert, max = 0;

	public StringPlay() {

	}

}

class StringMethods {
	public int convertToInt(StringPlay sp, String str) {

		sp.convert = Integer.parseInt(str);
		return sp.convert;
	}

	public int getMax(StringPlay sp, String str, char ch) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				sp.max++;
			} else {
				continue;
			}
		}
		return sp.max;

	}
}

public class strprac {

	public static void main(String[] args) {
		StringMethods sm = new StringMethods();
		StringPlay sp = new StringPlay();
		System.out.println(sm.getMax(sp, "fgfgfgf", 'g'));
		System.out.println(sm.convertToInt(sp, "123"));
	}

}
