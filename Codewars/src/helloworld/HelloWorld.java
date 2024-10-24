package helloworld;

public class HelloWorld {
	public static void main(String[] args)
	{
		int n =oddCount(3);
		System.out.println(n);
	}
	
	public static String duckDuckGoose(Player[] players, int goose) {
	    // Note: Player objects have a String field called 'name'.
		return players[(goose % players.length) - 1].name;
	  }
	
	class Player {
		public String name;
	}
	
	public static int oddCount(int n){
		return n/2;
	  }
}
