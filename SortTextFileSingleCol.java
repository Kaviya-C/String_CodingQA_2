package string.learn.continuity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTextFileSingleCol
{
	public static void main(String...args)
	{
		BufferedWriter bw=null;
		BufferedReader b=null;
		FileWriter fw=null;
		List<String> lines=new ArrayList<>();
		try
		{
		b=new BufferedReader(new FileReader("C:\\Users\\kaviy\\Kaviya_Eclipse_2023_03 _Workspace\\OnlineLearning\\src\\Sample.txt"));
		String currentLine=b.readLine();
		while(currentLine!=null)
		{
			lines.add(currentLine);
			currentLine=b.readLine();
		}
		Collections.sort(lines);
		for(String line:lines)
		{
			System.out.println(line);
		}
		bw=new BufferedWriter(new FileWriter("C:\\Users\\kaviy\\Kaviya_Eclipse_2023_03 _Workspace\\OnlineLearning\\src\\new.txt"));
		//bw.flush();
		for(String line:lines)
		{
			bw.write(line);
			bw.newLine();
		}
		}
		catch(IOException e)
		{
                 System.out.println(e.getCause());
		}
		finally
		{
			try {
				b.close();
			}
			catch(IOException e)
			{
				
			}
		}
	}

}
