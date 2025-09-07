package ayushautomation.TestPrograms;

public class ReplaceCharacters {

	public static void main(String[] args) {
		
	String str = "Java is an object oriented language";
	
	int result = str.length()-str.replaceAll("a", "").length();
	
	String result1 = str.replaceFirst("a", "q");
	
	String result2 = str.replaceAll("a", "  ");
	
	System.out.println(result2);
	System.out.println(result1);	
			
	System.out.println(result);
	
	}

}
