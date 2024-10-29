package katas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ChildrenAndCandiesTest {

	@Test
	void simpleTest() {
		int[] candies = new int[] { 1,2,3,4,5 };
		int[] actual = ChildrenAndCandies.distributionOfCandy(candies);
		assertArrayEquals(new int[] {6,6}, actual);
	}

	@Test
	void simpleTest2() {
		int[] candies = new int[] { 10,  2,  8, 22, 16,  4, 10,  6, 14, 20 };
		int[] actual = ChildrenAndCandies.distributionOfCandy(candies);
		assertArrayEquals(new int[] {17,18}, actual);
	}
}
