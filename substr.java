
public class substr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="application";
		System.out.println(str.substring(3, 6));
		String str1= "a,b,c,d";
		String[] splitstr=str1.split(",");
		System.out.println(splitstr.length);
		for(String s:splitstr) {
			System.out.print(s+ " ");
		}
	}

}
