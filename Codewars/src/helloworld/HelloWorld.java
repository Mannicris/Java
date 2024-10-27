package helloworld;

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
		return input.replaceAll("[A-Z]"," $0");
	}
}
