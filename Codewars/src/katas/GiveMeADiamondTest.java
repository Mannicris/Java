package katas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GiveMeADiamondTest {
	//tests with null result
	@Test
	void testZeroRows() {
		String actual = GiveMeADiamond.print(0);
		assertEquals(actual, null);
	}
		
	@Test
	void testTwoRows() {
		String actual = GiveMeADiamond.print(2);
		assertEquals(actual, null);
	}

	@Test
	void testLargeOddRows() {
		String actual = GiveMeADiamond.print(36);
		assertEquals(actual, null);
	}
	
	//tests with diamond string
	@Test
	void testOneRow() {
		String actual = GiveMeADiamond.print(1);
		assertEquals(actual, "*");
	}
	
	
	@Test
	void testThreeRows() {
		String actual = GiveMeADiamond.print(3);
		assertEquals(actual,  " * \n"
							+ "***\n"
							+ " * ");
	}
	
	@Test
	void testFiveRows() {
		String actual = GiveMeADiamond.print(5);
		assertEquals(actual,  "  *  \n"
							+ " *** \n"
							+ "*****\n"
							+ " *** \n"
							+ "  *  ");
	}
	
	@Test
	void testSevenRows() {
		String actual = GiveMeADiamond.print(7);
		assertEquals(actual,  "   *   \n"
							+ "  ***  \n"
							+ " ***** \n"
							+ "*******\n"
							+ " ***** \n"
							+ "  ***  \n"
							+ "   *   ");
	}
	
}
