import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		String str;
		int duplicate=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		str=sc.nextLine();
		sc.close();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.print(str.charAt(j)+ ", ");
					duplicate++;
				}
			}
		}
		System.out.println();
	System.out.println(duplicate);
	}

}
