package string.learn.continuity;

import java.util.Set;
import java.util.TreeSet;

public class CommonCharBwTwoStringAlphaorder 
{
	public static void commonCharacter(String s1,String s2)
	{
		//String first; String second;
		
		char[] firstArray=s1.replaceAll("\\s+","").toCharArray();
	   
		char[] secondArray=s2.replaceAll("\\s+","").toCharArray();
	   
	   Set<Character> firstSet=new TreeSet<>();
	   Set<Character> secondSet=new TreeSet<>();
	
	   for(char c:firstArray)
	   {
		   firstSet.add(c);
	   }
	   System.out.println(firstSet);
       for(char c:secondArray)
       {
    	   secondSet.add(c);
       }
       System.out.println(secondSet);
       firstSet.retainAll(secondSet);
       System.out.println("Common character: "+firstSet);
       System.out.println("Count: "+firstSet.size());
	}
	public static void main(String...args)
	{
		commonCharacter("java","guv");
	}

}
