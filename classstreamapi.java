import java.util.Arrays;
import java.util.List;

public class classstreamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		numbers.stream().filter(x->x%3==0).forEach(System.out::println); //numbers divisible by 3

	}

}
