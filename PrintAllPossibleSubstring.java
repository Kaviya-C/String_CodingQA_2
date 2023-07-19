package string.learn.continuity;

public class PrintAllPossibleSubstring 
{
	
	public static void printAllSubstring(String input)
	{
		System.out.println("Possible substring: "+input+" are: ");
	
		for(int index=0;index<input.length();index++)
		{
			for(int next=index+1;next<=input.length();next++)
			{
				System.out.println(input.substring(index,next));
			}
		}
	}
	
	public static void printSubstringBuilder(String input)
	{
		System.out.println("Possible substring: "+input+" are: ");
	
		StringBuilder substring;
		for(int index=0;index<input.length();index++)
		{
			substring=new StringBuilder().append(input.charAt(index));
			
			System.out.println(substring);
			
			for(int next=index+1;next<input.length();next++)
			{
				substring.append(input.charAt(next));
				System.out.println(substring);
			}
		}
	}
	
	
	public static void main(String...args)
	{
	printAllSubstring("java");//--//using substring method
	
	printSubstringBuilder("ram");// using stringBuilder 
	}
}
