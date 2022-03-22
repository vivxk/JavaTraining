//prog to search a pattern in a given string. 

public class strprac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patSearch("hello world", "wor");
		patSearch("aaaaa", "aaa");
		
	}

	
	public static void patSearch(String string,String pattern) {
		int pos = string.indexOf(pattern);
		while (pos>=0) {
			System.out.println(pos + " ");
			pos = string.indexOf(pattern, pos+1);
			
		}
		
	}
}
