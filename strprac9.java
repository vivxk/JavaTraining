import java.util.regex.Matcher;
import java.util.regex.Pattern;

class students1 {
	String name;
	String usn;
	String college;
	int cpga;

	public students1(String name, String usn, String college, int cgpa) {
		this.name = name;
		this.usn = usn;
		this.college = college;
		this.cpga = cgpa;
	}

}

class StudentImplementation {
	int uid = 0;

	public students1 getStudentInfo(String str) {
		String name = null;
		String usn = null;
		String college = null;
		int cgpa = 0;

		String s = str;

//		System.out.println(s);
		Pattern pattern1 = Pattern.compile("(^[\\w\\s]*)");
		Matcher matcher1 = pattern1.matcher(s);
		if (matcher1.find()) {
			name = matcher1.group();
		}

		Pattern pattern = Pattern.compile("([A-Z]{3})");
		Matcher matcher = pattern.matcher(s);
		if (matcher.find()) {
			college = matcher.group();
		}
		Pattern pattern2 = Pattern.compile("([0-9A-Z]{10})");
		Matcher matcher2 = pattern2.matcher(s);
		if (matcher2.find()) {
			usn = matcher2.group();
		}

		Pattern pattern3 = Pattern.compile("([0-9]{3})");
		Matcher matcher3 = pattern3.matcher(s);
		if (matcher3.find()) {
			uid = Integer.parseInt(matcher3.group());
		}
		Pattern pattern4 = Pattern.compile("([0-9]$)");
		Matcher matcher4 = pattern4.matcher(s);
		if (matcher4.find()) {
			cgpa = Integer.parseInt(matcher4.group());
		}

		students1 studs = new students1(name, usn, college, cgpa);
		return studs;

	}

	public String getStudentSection(students1 s) {
		return null;
		
		
	}
}

public class strprac9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentImplementation s = new StudentImplementation();
		System.out.println(s.getStudentInfo("Amit Rai@1PC16CS046-ALU#8"));

	}

}
