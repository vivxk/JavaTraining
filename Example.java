import java.util.function.BiFunction;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String, String, Boolean> compareString = (x, y) ->
		 x.equals(y);
		 System.out.println(compareString.apply("Java8", "Java8")); 

	}

}
