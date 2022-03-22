
public class strs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1= "my first program";
//		System.out.println(str1.length());
//		System.out.println(str1.indexOf("p"));
//		System.out.println(str1.charAt(5));
//		System.out.println(str1.endsWith("am"));
//		System.out.println(str1.startsWith("m"));
//		System.out.println(str1.isEmpty());
//		System.out.println(str1.replace("my", "your"));
		
		String str2="this is a really simple sentence";
		int vowCount=0; 
		int consCount=0;
		System.out.println(str2);
		for(int i=0;i<str2.length();i++) {
			if(str2.charAt(i)=='a' || str2.charAt(i)=='e' || str2.charAt(i)=='i' || str2.charAt(i)=='o' || str2.charAt(i)=='u') {
				vowCount++;
				}
			else if (str2.charAt(i)>='a' && str2.charAt(i)<='z') 	
			 {
				consCount++;
			}
			
		}
	System.out.println("Vowel Count= "+vowCount);
	System.out.println("Consonant Count= "+consCount);
	}

}
