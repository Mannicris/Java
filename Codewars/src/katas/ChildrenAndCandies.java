package katas;

public class ChildrenAndCandies {
	public static int[] distributionOfCandy(int[] candies) {
		int[] result = candies.clone();
		int distributionCount = 0;

		while (!doAllChildrenHaveSameNumberOfCandy(result)) {
			for (int i = 0; i < result.length; i++) {
				// increment odds
				if (result[i] % 2 == 1)
					result[i]++;

				// give half away
				result[i] /= 2;
			}

			// take half of neighbor
			int nextValue = 0;
			int currentValue = result[result.length - 1];
			for (int i = 0; i < result.length; i++) {
				nextValue = result[i];
				result[i] += currentValue;
				currentValue = nextValue;
			}

			distributionCount++;
		}

		return new int[] { distributionCount, result[0] };
	}

	private static boolean doAllChildrenHaveSameNumberOfCandy(int[] candies) {
		int first = candies[0];
		for (int i = 1; i < candies.length; i++) {
			if (first != candies[i])
				return false;
		}

		return true;
	}
}
