import java.io.FileNotFoundException;

public class trycatch {

	public static void main(String[] args) {
		
		int a=20;
		int	b=0;
		int	c=0;
		try{
			c=a/b;
		}
		catch (ArithmeticException e) {
			System.out.println(e);
			// TODO: handle exception
		}
		finally {
			System.out.println("try-catch executed");
		}

//		try {
//			throw new FileNotFoundException(); //manually throwing an exception
//		}
//		catch(FileNotFoundException e) { //catching the exception thrown back here
//			System.out.println("file not found with the given name");
//		}
	}

}
