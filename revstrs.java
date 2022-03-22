import java.util.Scanner;

public class revstrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		String rev=new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		str=sc.nextLine();
		sc.close();
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);		
			}
		System.out.println(rev);
	}
}


