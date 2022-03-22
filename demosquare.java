import java.util.Scanner;

public class demosquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class square {
			int area(int side) {
				return side * side;
			}
		}
		square sq = new square();
		int side;
		try (Scanner sc = new Scanner(System.in)) {
			side = sc.nextInt();
		}
		System.out.println(sq.area(side));
	}

}
