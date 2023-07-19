package string.learn.continuity;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations 
{
	public static void main(String...args)
	{
		String word="pom";
		List<String> result=findPermutations(word);
		
		System.out.println("Permutations of "+word+" is");
		for(String eachForm:result) {
			System.out.println(eachForm);
		}
	}
	
	public static List<String>findPermutations(String input)
	{
		List<String> list=new ArrayList<>();
		
		permute("",input,list);
		
		return list;
	}
	public static void permute(String prefix,String suffix,List<String> newPerm) {
		
		int length=suffix.length();
		if(length==0)
		{
			newPerm.add(prefix);
		}
		else
		{
			for(int start=0;start<suffix.length();start++)
			{
				permute(prefix+suffix.charAt(start)
				,suffix.substring(0,start)+suffix.substring(start+1,length),newPerm);
			}
		}
	}
	
}
