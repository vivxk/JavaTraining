/**
 * 
 */
/**
 * @author Vivek
 *
 */
public class maxcharoccur {
	public static void main(String[] args) {
		String str = "grass is greener on the other side";
		char maxchar = str.charAt(0);
		int[] freq = new int[str.length()];
		int i, j, max;
		char string[] = str.toCharArray();
		for (i = 0; i < string.length; i++) {
			freq[i] = 1;

			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					freq[i]++;
					string[j] = '0';
				}
			}
		}
		max = freq[0];
		for (i = 0; i < freq.length; i++) {
			if (max < freq[i]) {
				max = freq[i];
				maxchar = string[i];

			}

		}
		System.out.println(maxchar);
	}

}
