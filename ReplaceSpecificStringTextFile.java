package string.learn.continuity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReplaceSpecificStringTextFile
{
	public static  void modifyFile(String filePath,String old,String replacement)
	{
		File fileModify=new File(filePath);
		
		String oldContent="";
		
		BufferedReader read=null;FileWriter write=null;
		
		try
		{
			read=new BufferedReader(new FileReader(fileModify));
		    String line=read.readLine();
		    
		    while(line!=null)
		    {
		    	System.out.println(oldContent+line+System.lineSeparator());
		    	oldContent=oldContent+line+System.lineSeparator();//90
		    	line=read.readLine();
		    }
		    System.out.println("_______________");
		    String newContent=oldContent.replaceAll(old, replacement);
		    System.out.println(newContent);
		    write=new FileWriter(fileModify);
		    write.write(newContent);
		  
		
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			
		}
		
	}
	public static void main(String...args)
	{
	//C:\Users\kaviy\OneDrive\Desktop\Student.txt
		
		modifyFile("C:\\Users\\kaviy\\OneDrive\\Desktop\\Student.txt","80","100");
	}

}
