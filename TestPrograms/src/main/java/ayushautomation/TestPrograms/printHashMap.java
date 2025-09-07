package ayushautomation.TestPrograms;

import java.util.HashMap;
import java.util.Map;

public class printHashMap {

	public static void main(String[] args) {
	  
	        Map<String, Integer> studentGrades = new HashMap<>();
	        studentGrades.put("Alice", 95);
	        studentGrades.put("Bob", 80);
	        studentGrades.put("Charlie", 75);

	        System.out.println(studentGrades); // Output: {Bob=80, Alice=95, Charlie=75} (order may vary)
	    }
	

	}


