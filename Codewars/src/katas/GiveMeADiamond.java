package katas;

public class GiveMeADiamond {
	public static String print(int n) {
		if(n < 0 || n % 2 == 0) return null;
		
		String result="";
		int asterixCount = 1;
		int spaceCount = n / 2;
		boolean midReached = false;
		for(int i=0;i<n;i++)
		{
			result += " ".repeat(spaceCount) + "*".repeat(asterixCount) + " ".repeat(spaceCount);
			if(i<n-1) result += "\n";
			
			if(i==n/2) midReached=true;
			
			if(!midReached)
			{
				spaceCount--;
				asterixCount+=2;
			}
			else 
			{
				spaceCount++;
				asterixCount-=2;
			}
		}
		
		return result;
	}
}
