
public class areasq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class square {
			int area(int side) {
				return side * side;
			}
		}
		square sq;
		sq = new square();
		System.out.println(sq.area(4));

	}
}