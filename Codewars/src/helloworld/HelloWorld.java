package helloworld;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class HelloWorld {
	public static void main(String[] args) {
		camelCase("camelCase");
	}

	public static String duckDuckGoose(Player[] players, int goose) {
		// Note: Player objects have a String field called 'name'.
		return players[(goose % players.length) - 1].name;
	}

	class Player {
		public String name;
	}

	public static int oddCount(int n) {
		return n / 2;
	}

	public static String doubleChar(String s) {
		String result = "";
		for (char c : s.toCharArray()) {
			result += c;
			result += c;
		}

		return result;
	}

	public static boolean solution(String str, String ending) {
		return str.endsWith(ending);
	}

	public static String camelCase(String input) {
		return input.replaceAll("[A-Z]", " $0");
	}

	public static String longest(String s1, String s2) {
		//add distinct characters from 2 lists
		HashSet<Character> set = new HashSet<Character>();
		for (char c : s1.toCharArray()) {
			if (!set.contains(c))
				set.add(c);
		}

		for (char c : s2.toCharArray()) {
			if (!set.contains(c))
				set.add(c);
		}

		//Sort alphabetically
		Character[] charArray = set.toArray(new Character[set.size()]);
		Arrays.sort(charArray);

		//to char[]
		char[] myCharArray = Arrays.stream(charArray).map(ch -> ch.toString()).collect(Collectors.joining())
				.toCharArray();

		String result = new String(myCharArray);
		return result;
	}
}
