package string.learn.continuity;

public class RemoveAllVowels 
{
	public static void main(String...args)
	{
		double d=2;
		int i=(int)d;
		String s="Education";
		
		String result=s.replaceAll("[AEIOUaeiou]", "");
		
		System.out.println("String with Vowels: "+s);
		
		System.out.println("String without vowels: "+result);
	}

}
