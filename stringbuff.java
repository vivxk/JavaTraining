/**
 * 
 */

/**
 * @author Vivek
 *
 */
public class stringbuff {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("student");
		sb.append(" details");
		System.out.println(sb);
		System.out.println(sb.replace(7, 14, "informs"));
		System.out.println(sb.delete(7, 9));
		System.out.println(sb.reverse());
		sb.setCharAt(1, 'i');
		System.out.println(sb);
				
		
	}
}
