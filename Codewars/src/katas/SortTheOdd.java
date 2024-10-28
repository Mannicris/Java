package katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheOdd {
	public static int[] sortArray(int[] array) {
		int[] oddNumbers = Arrays.stream(array).filter(i -> i % 2 == 1).sorted().toArray();

		//replace only odd numbers in source array
		int[] result = array.clone();
		for (int i = 0, s=0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				result[i] = oddNumbers[s];
				s++;
			}
		}

		return result;
	}
}
