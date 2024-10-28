package katas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class SimpleKatas {
	static int count = 1;

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
		String s = s1 + s2;
		StringBuilder sb = new StringBuilder();
		s.chars().distinct().sorted().forEach(c -> sb.append((char) c));
		return sb.toString();
	}

	public static String accum(String s) {

		StringBuilder sb = new StringBuilder();
		s.chars().forEach(c -> {
			if (count > 1)
				sb.append('-');

			for (int i = 1; i <= count; i++) {
				char upperOrLower = (char) c;
				if (i == 1)
					upperOrLower = Character.toUpperCase(upperOrLower);
				else
					upperOrLower = Character.toLowerCase(upperOrLower);

				sb.append((char) upperOrLower);
			}

			count++;
		});

		count = 1;
		return sb.toString();
	}
}
