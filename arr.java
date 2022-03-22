import java.util.Arrays;

public class arr {

	public static void main(String[] args) {
		int arr[] = { 20, 10, 40, 30, 50 };
		Arrays.sort(arr);
		int secMax = arr.length - 2;
		System.out.println("Second largest element: " + arr[secMax]);
		
		int arr1[] = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					System.out.println("Duplicate element: " + arr1[j]);

				}
			}
		}
		int arr2[] = { 5, 2, 8, 7, 1 };
		Arrays.sort(arr2);
		System.out.print("Descending order: ");
		for (int i = arr2.length - 1; i >= 0; i--) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.print("Ascending order: ");
		for (int tmp : arr2) {
			System.out.print(tmp + " ");
		}
	
		
	}

}
