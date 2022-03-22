import java.math.BigInteger;

public class bigint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(fibonacci(100));
		BigInteger p = BigInteger.valueOf(7);

	}

	public static BigInteger fibonacci(int num) {
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		for (int i = 2; i <= num; i++) {
			c = a.add(b);
			a = b;
			b = c;
		}
		return b;

	}
}
