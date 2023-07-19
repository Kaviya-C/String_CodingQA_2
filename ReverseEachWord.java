package string.learn.continuity;

public class ReverseEachWord 
{
	public static String reverseSentences(String sentences)
	{
		String[] s=sentences.split("\\s+");
		
		String reverse="";
		
		for(int index=s.length-1;index>=0;index--)
		{
		    reverse=reverse+s[index]+" ";	
		}
		
		return reverse;
	}
	public static void main(String...args)
	{
		String input="java language best for me";
		
		String s=reverseSentences(input);
		System.out.println(input);
		
		System.out.println(s);
	}

}
