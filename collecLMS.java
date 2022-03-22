import java.util.ArrayList;
import java.util.HashMap;

class Mobile{
	HashMap<String, ArrayList<String>> mobileList = new HashMap<>(); //key type-string, val type-ArrayList<String> 
	
	public String addMobile(String company, String model) {
		if(mobileList.containsKey(company)) {
			ArrayList<String> newList = mobileList.get(company);
			newList.add(model);
			mobileList.replace(company, newList);
		}
		else {
			ArrayList<String> newList = new ArrayList<>();
			newList.add(model);
			mobileList.put(company, newList);
		
		}
		
		return "model successfully added!";
	}

	public ArrayList<String> getModel(String company){
		
		ArrayList<String> tmpList = mobileList.get(company);
		if(mobileList.containsKey(company))
		if(!tmpList.isEmpty()) {
			return tmpList;
		}
				
		return null;
		
	}
	public String buyMobile(String company, String model) {
			if(mobileList.containsKey(company)) {
				ArrayList<String> tmpList = mobileList.get(company);
				if(!tmpList.isEmpty()) {
					if(tmpList.contains(model)) {
						tmpList.remove(model);
						mobileList.put(company, tmpList);
						return "mobile sold successfully";
					}
					else {
						return "item not available";
					}
				}
				
			}
	return "item not available";
	
	}
}

public class collecLMS {
	public static void main(String[] args) {
		Mobile obj = new Mobile();
		System.out.println(obj.addMobile("Oppo", "K3"));
		System.out.println(obj.getModel("Oppo"));
		System.out.println(obj.buyMobile("Oppo", "K3"));
		
	}

}
