import java.util.ArrayList;
import java.util.Arrays;

//LMS Practice
class Vaccine {
	private int age;
	private float dosage;

	public Vaccine(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getDosage() {
		return dosage;
	}

	public void setDosage(float dosage) {
		this.dosage = dosage;
	}

}

class VaccinationCamp {

	ArrayList<Vaccine> list = new ArrayList<>();

	void assignVaccine() {
		int[] ages = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ages[i] = list.get(i).getAge();
		}
		for (int i = 0; i < ages.length; i++) {
			if (ages[i] >= 45) {
				list.get(i).setDosage(250);
			} else if (ages[i] >= 20 && ages[i] < 45) {
				list.get(i).setDosage(200);
			} else {
				list.get(i).setDosage(100);
			}
		}

	}

	float vaccineInjected() {
		float total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i).getDosage();
		} 
		return total;
	}

}

public class coded {

	public static void main(String[] args) {
		VaccinationCamp vc = new VaccinationCamp();
		vc.list.add(new Vaccine(49));
		vc.list.add(new Vaccine(26));
		vc.list.add(new Vaccine(19));
		vc.assignVaccine();
		System.out.println(vc.vaccineInjected());
//		vc.vaccineInjected();
	}
}
