import java.util.*;
import java.util.Map.Entry;

class Population {
	Map<String, Integer> dataList = new HashMap<String, Integer>();

	String maxPopulation() {
		int values[] = dataList.values().stream().mapToInt(x -> x).toArray();
		int max = 0;
		Arrays.sort(values);
		for (int i = 0; i < values.length; i++) {
			max = values[i];
		}
		String key = "";
		for (Entry<String, Integer> entry : dataList.entrySet()) {
			if (entry.getValue().equals(max))
				key = entry.getKey();

		}
		return key;

	}

	String minPopulation() {
		int[] values = dataList.values().stream().mapToInt(x -> x).toArray();
		int min = 0;
		Arrays.sort(values);
		for (int i = values.length - 1; i >= 0; i--) {
			min = values[i];
		}
		String key = "";
		for (Entry<String, Integer> entry : dataList.entrySet()) {
			if (entry.getValue().equals(min))
				key = entry.getKey();

		}
		return key;
	}

	long totalPopulation() {
		int[] values = dataList.values().stream().mapToInt(x -> x).toArray();
		long sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}

		return sum;

	}
}

public class hmappractice {

	public static void main(String[] args) {

		Population population = new Population();
		population.dataList.put("India", 26382898);
		population.dataList.put("USA", 82738);
		population.dataList.put("UK", 92732);
		String max = population.maxPopulation();
		String min = population.minPopulation();
		long total = population.totalPopulation();
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		System.out.println("total = " + total);
	}

}
