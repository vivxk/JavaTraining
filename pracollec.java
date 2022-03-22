import java.util.ArrayList;
import java.util.List;

class Company {
	private String companyName;
	private String type;
	private int turnover;

	public Company(String companyName, String type, int turnover) {
		this.companyName = companyName;
		this.type = type;
		this.turnover = turnover;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTurnover() {
		return turnover;
	}

	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}

}

class Record {
	public List<Company> companies = new ArrayList<Company>();

	public String addCompany(Company company) {
		companies.add(company);
		return "Added";

	}

	public String filterData(String query) {
		String[] splitString = query.split("\\s");
		int queryLength = splitString.length;
		if (query.substring(5, 7).equalsIgnoreCase("==") == false) {
			return "Invalid operator";
		} else if (query.substring(0, 4).equalsIgnoreCase("type") == false) {
			return "Invalid";
		} else if (queryLength != 3) {
			return "Invalid";
		} else {
			return query;
		}	
		
	}

}

public class pracollec {

	public static void main(String[] args) {
		Company c1 = new Company("Comp", "MyCompany", 5000);
		Record record = new Record();
		System.out.println(record.addCompany(c1));
		System.out.println(record.filterData("type == MyCompany"));

	}

}
