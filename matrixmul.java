
public class matrixmul {

	public static void main(String[] args) {
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 6, 6, 6 }, { 7, 7, 7 }, { 8, 8, 8 } };
		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(c[i][j]);
			}
		}
	}
}

