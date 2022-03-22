import java.util.ArrayList;

class student {
	int rollno;
	String name;
	int age;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class stdlist {

	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student();
		student s3 = new student();

		s1.setRollno(101);
		s1.setName("Deepak");
		s1.setAge(22);
		s2.setRollno(102);
		s2.setName("Ravi");
		s2.setAge(25);
		s3.setRollno(103);
		s3.setName("Raj");
		s3.setAge(19);

		ArrayList<student> lst = new ArrayList<student>();
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);

		for (student s : lst) {
			System.out.println("Rollno: " + s.rollno + " Name: " + s.name + " Age: " + s.age);
		}
		System.out.println("Student who are present ");
		for (student s : lst) {
			System.out.println("Name: " + s.name);
		}

		System.out.println("Student below age 20: ");
		for (student s : lst) {
			if (s.age < 20) {
				System.out.println("Rollno: " + s.rollno + " Name: " + s.name + " Age: " + s.age);
			}
		}
	}

}
