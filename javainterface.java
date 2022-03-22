import java.util.Scanner;

public class javainterface {

	public static void main(String[] args) {

		String str, str1;
		Scanner inp = new Scanner(System.in);
		str = inp.nextLine();
		str1 = inp.nextLine();
		inp.close();
		equalclass e = new equalclass(); // can also do equal e = new equalclass()
		System.out.println(e.isequal(str, str1));
	}

}

@FunctionalInterface
interface equal {
	public Boolean isequal(String s, String s1);
}

class equalclass implements equal {
	@Override
	public Boolean isequal(String s, String s1) {
		if (s.equals(s1)) {
			return true;
		} else {
			return false;
		}

	}
}