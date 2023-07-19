package string.learn.continuity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MostRepeatedWordInTextFile
{
	public static void main(String...args)
	{
		BufferedReader read=null;
		FileReader file=null;
		
		Map<String,Integer> map=new HashMap<>();
		try
		{
		read=new BufferedReader(new FileReader("C:\\\\Users\\\\kaviy\\\\Kaviya_Eclipse_2023_03 _Workspace\\\\OnlineLearning\\\\src\\\\Sample.txt"));
     	String currentLine=read.readLine();
     	while(currentLine!=null)
     	{
     		String[] array=currentLine.toLowerCase().split("\\s+");
     		for(String word:array)
     		{
     			if(map.containsKey(word))
     			{
     				map.put(word, map.get(word)+1);
     			}
     			else
     			{
     				map.put(word, 1);
     			}
     		}
     		currentLine=read.readLine();
     	}
     	Set<String> onlyKeys=map.keySet();
     	int count=0;
     	String key=null;
     	for(String entry:onlyKeys)
     	{
     		if(map.get(entry)>count)
     			{
     				count=map.get(entry);
     				key=entry;
     				
     			}  
     	}
     	System.out.println("most repeated word in the text file is: \n"+key+" repeated "+count+" times");
		
		
		
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			try {
			read.close();
			}
			catch(IOException e)
			{
				
			}
			}
		
		}

}
