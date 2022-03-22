import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 30, 40, 50 };
		int sum = 0;
		System.out.print("Using normal for loop: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("Using enhanced for loop: ");
		for (int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.print("Sum of all elements = ");
		for (int tmp : arr) {
			sum += tmp;
		}
		System.out.println(sum);
		int a[] = { 1, 2, 3, 4, 5 };
		int b[]= new int[a.length];
		b=a;
		System.out.println("Copy of array: ");
		for(int tmp:b) {
			System.out.print(tmp + " ");
		}
	}

}
