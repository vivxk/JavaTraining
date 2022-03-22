
public class myexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new exampleException();
		}
		catch (exampleException e) {
			// TODO: handle exception
			System.out.println("Exception thrown");
			
		}
	}

}


class exampleException extends Exception{
	int	age;
	public exampleException(int age) {
		this.age=age;
	}
}
