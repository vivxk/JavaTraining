class Convert {
	public int distance(String w, String w1) {
		int count = 0;
		for (int i = 0; i < w.length(); i++) {
			for (int j = 0; j < w1.length(); j++) {
				if (w.charAt(i) == w1.charAt(j)) {
					w.replace(w.charAt(i), w1.charAt(j));
					count++;
				} else {
					continue;
				}

			}

		}
		return count;
	}
}

public class strprac5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Convert c = new Convert();
		System.out.println(c.distance("horse", "ros"));
	}

}
