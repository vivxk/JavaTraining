class demo{
	void d() {
		String str = null;
		try {
			int l = str.length();
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
			throw new ArithmeticException();
		}
	}
}

public class excepHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		demo dobj = new demo();
		dobj.d();
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
