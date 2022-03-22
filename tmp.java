import java.util.HashMap;

class Students {
	HashMap<String, String> dataList = new HashMap<>();

	public String addStudentDetails(String name, String id) {
		if (dataList.containsKey(name)) {
			return "data already present";
		} else {
			dataList.put(name, id);
			return "id generated";
		}
	}

//	public String deleteId(String name) {
//		if (dataList.containsKey(name)==true) {
//			return "Id not found";
//		} 
//		else {
//			dataList.remove(name, dataList.get(name));
//			return "Id deleted successfully";
//		}
//	}

	public String searchId(String name) {
		if (dataList.containsKey(name)) {
			return (String) dataList.get(name);
//			dataList.remove(name, dataList.get(name));
		} else {
			return "ID NOT FOUND";
		}
	}

}

public class tmp {

	public static void main(String[] args) {

		/*
		 * String string = "This is my life"; String[] s = string.split(" ");
		 * System.out.println(s.length); List<String> list = new
		 * ArrayList<String>(Arrays.asList("a","b","c","d","e")); List<String> list2 =
		 * new ArrayList<String>(Arrays.asList("a","b","c","d"));
		 * 
		 * list.stream().filter(i -> list2.stream().noneMatch(j ->
		 * j.equals(i))).forEach(System.out::println);
		 */
		Students s1 = new Students();
		Students s2 = new Students();
		Students s3 = new Students();
		Students s4 = new Students();
		System.out.println(s1.addStudentDetails("Sarah", "99889"));
		System.out.println(s2.addStudentDetails("John", "78985"));
//		System.out.println(s3.deleteId("Sarah"));
		System.out.println(s4.searchId("John"));
		
	
	}
}


