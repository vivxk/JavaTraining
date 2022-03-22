class SnakeCase {
	public String camelToSnake(String str) {
		String replacement = "$1_$2";
		str=str.replaceAll("([a-z])([A-Z]+)", replacement).toLowerCase();

		return str;
	}
}

public class strprac4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnakeCase snakeCase = new SnakeCase();
		System.out.println(snakeCase.camelToSnake("DoSelect"));
	}

}
