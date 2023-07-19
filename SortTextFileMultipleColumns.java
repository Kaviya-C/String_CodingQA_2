package string.learn.continuity;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	String name;
	int marks;
	
	Student(String studName,int studMarks){
		this.name=studName;
		this.marks=studMarks;
	}		
}
class nameCompare implements Comparator<Student>
{
	@Override
	public int compare(Student s1,Student s2)
	{
		int result= s1.name.length()<s2.name.length()?1:s1.name.length()>s2.name.length()?-1:0;
	    return result;
	}
	
}
class marksCompare implements Comparator<Student>
{
	@Override
	public int compare(Student s1,Student s2)
	{
		return s1.marks-(s2.marks);
	}
}
public class SortTextFileMultipleColumns 
{
	public static void main(String...args)
	{
		BufferedReader b=null;
		FileReader f=null;
		
		try
		{
			b=new BufferedReader(new FileReader("C:\\Users\\kaviy\\Kaviya_Eclipse_2023_03 _Workspace\\OnlineLearning\\src\\new.txt"));
		    List<Student> list=new ArrayList<>();
		    String currentLine=b.readLine();
		    while(currentLine!=null)
		    {
		    	String[] student=currentLine.split(" ");
		    	
		    	String name=student[0];
System.out.println(name);
		    	int marks=Integer.valueOf(student[1]);
		    	System.out.println(marks);
		    	list.add(new Student(name,marks));
		    	
		    	currentLine=b.readLine();
		    }
		    Collections.sort(list,new nameCompare());
		    
		    for(Student s:list)
		    {
		    	System.out.println(s.name+" "+s.marks);
		    	
		    }
		
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			
		}
	}
/*
 * Comparator in collection is an interface---
 *  compare()   -- which takes two arguments
 *  
 *  compare(String s1,String s2)
 *  
 *  compareTo -- method --- return integer as output
 *  
 *  if s1<s2=== -1 we have to swap
 *  
 *  if(s1> s2 === +1 don't swap
 *   
 *  if(s1==s2    0 don't swap
 * 
 * 
 */







}
