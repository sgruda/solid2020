package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListOccurrenceCounter {

	Map<Integer, Integer> occurrence = new HashMap<Integer, Integer>();
	private Integer minValue = Integer.MAX_VALUE;
	private Integer maxValue = Integer.MIN_VALUE;
	
	public ListOccurrenceCounter(List<Integer> integerList) {
		countOccurrenceAndSetMinMaxValue(integerList);
	}

	public void countOccurrenceAndSetMinMaxValue(List<Integer> integerList) {
		for(Integer i : integerList) {
			if (occurrence.containsKey(i)) {
				occurrence.put(i, getValueForKey(i) + 1);
			} else {
				occurrence.put(i, 1);
			}
			setMinValueIfTrue(i);
			setMaxValueIfTrue(i);
		}
	}
	private void setMinValueIfTrue(Integer i) {
		if (i < minValue) {
			minValue = i;
		}
	}
	private void setMaxValueIfTrue(Integer i) {
		if (i > maxValue) {
			maxValue = i;
		}
	}
	public int getValueForKey(int key) {
		return occurrence.getOrDefault(key, 0);
	}

}