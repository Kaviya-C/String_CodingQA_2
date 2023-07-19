package string.learn.continuity;

public class StringQuiz 
{
	public static void main(String...args)
	{
		
		System.out.println("1".concat("2").repeat(5).charAt(7));
	
		
		//1212121212
		
		String s=" \u00A0Java,Concept,Learn\u00A0  ".strip();
		String result=s.strip();
		System.out.println(result);
		
//		System.out.println
//		("JAVAJ2EE".substring(2,5).substring(1).charAt(2));
		
		System.out.println("0".indent(0));
		System.out.println("1".indent(1));
		System.out.println("2".indent(2));
		
		//System.out.println("Java concept of".substring(8,4));
		
		String[] array= {"java","kaviya"};
		System.out.println(String.join("--", array));
		
		System.out.println("A".compareTo("B"));
		//A-65  //66
       // 65<66== -1
		
		"ABC01239abc".chars().forEach(System.out::println);
	
	     System.out.println("null"+null+1);
	     
	     System.out.println(1+"null"+"null");
	     
	     String s1="java concept of the day".replace("a", "A");
	     System.out.println(s1);
	     System.out.println
	     ("java concept of the day".replace("a", "A").lastIndexOf('a'));
	
	     StringBuilder sb=new StringBuilder(2);//negative array size exception
	     StringBuffer sbf=new StringBuffer(6);//not allowed in stringBuffer and string Builder
	     
	     System.out.println(sbf);
	     sb.append("Arun");
	     System.out.println(sb);
	     
	     
	     String str=null;
	     //System.out.println(str.isBlank());--nullpointerexception
	     
	     String string=" ";
	     System.out.println(string.isBlank());
	     System.out.println(string.isEmpty());
	     
	     
	     StringBuilder sbu=new StringBuilder("0123456789");
	     System.out.println(sbu.delete(3, 6).deleteCharAt(4).deleteCharAt(5));
	     
	     
	     String g="123321123";
	     g.replaceFirst("123", "321")
	     .replaceAll("12", "21")
	     .substring(3,6);
	     
	     System.out.println(g.replaceFirst("123","321"));
	    
	    
	     sbu.insert(3, "hello");
	     System.out.println(sbu);
	     
	     String s11="jaa is my favourite";
	     String s2="java developer kaviya";
	     System.out.println(s11.contains("gdf")==s2.contains("ioa"));
	     
	     
	     String str1 = "OnE tWo ThReE fOuR";
         
	     String str2 = "oNeTwOtHrEeFoUr";
	         
	     System.out.println(str1.trim().toLowerCase());
	     System.out.println(str2.toLowerCase());
	     System.out.println(str1.trim().equalsIgnoreCase(str2));
	     
	     StringBuffer sd=new StringBuffer("One Two Three Four Five");
	     System.out.println(sd.reverse());
	     System.out.println(sd.reverse().indexOf("Two"));
	     "Java\nConcept\nof\n".lines().forEach(System.out::println);
	
	
	}

}
