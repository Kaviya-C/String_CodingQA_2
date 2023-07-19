package string.learn.continuity;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
public class AppendTextToFIle 
{
	public static void main(String...args)
	{
		BufferedWriter bw=null;
		PrintWriter pw=null;
		FileWriter b=null;
		PrintWriter p=null;
		FileReader f=null;
		BufferedReader br=null;
		int chara=0;int word=0;int line=0;
		try
		{
		 b=new FileWriter("C:\\Users\\kaviy\\Kaviya_Eclipse_2023_03 _Workspace\\OnlineLearning\\src\\Sample.txt",true);
         bw=new BufferedWriter(b);
         pw=new PrintWriter(bw);
         
         pw.println();
         pw.println("this is my first");
         pw.println("first append the file");
		 
		 System.out.println("almost done ");
		 
		 br=new BufferedReader(new FileReader("C:\\\\Users\\\\kaviy\\\\Kaviya_Eclipse_2023_03 _Workspace\\\\OnlineLearning\\\\src\\\\Sample.txt"));
		 
		String currentLine= br.readLine();
		 while(currentLine!=null)
		 {
			 line++;
			 
			 String[] array=currentLine.split(" ");
			 word+=array.length;
			 for(String words:array)
			 {
				 chara+=words.length();
			 }
			 currentLine=br.readLine();
		 }
		 
		 
//		 	String currentLine=b.readLine();
//		 	
//		 	while(currentLine!=null)
//		 	{
//		 		line++;
//		 		
//		 		String[] arrayOfWord=currentLine.split("\\s+");
//		 	
//		 	    word=word+arrayOfWord.length;
//		 	    
//		 	    for(String each:arrayOfWord)
//		 	    {
//		 	    	chara+=each.length();
//		 	    }
//		 	    currentLine=b.readLine();
//		 	}
		 	System.out.println("NUmbers of Character: "+chara);
		 	System.out.println("Number of word: "+word);
		 	System.out.println("Number of line: "+line);
		
		}
		
		catch(IOException ex)
		{
			System.out.println(ex.getCause());
		}
		finally
		{
			try {
			//	p.close();
				b.close();
				//f.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
