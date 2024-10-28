package katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheOdd {
	public static int[] sortArray(int[] array) {
		// Get odd numbers and sort increasingly
		Integer[] aInt = new Integer[array.length];
		Arrays.setAll(aInt, i -> array[i]);
		List<Integer> oddNumbers = new ArrayList<Integer>();
		oddNumbers = Arrays.stream(aInt)
				.filter(n -> n % 2 == 1).collect(Collectors.toList());
		Collections.sort(oddNumbers);

		//replace only odd numbers in source array
		int[] result = array.clone();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				result[i] = oddNumbers.get(0);
				oddNumbers.remove(0);
			}
		}

		return result;
	}
}
