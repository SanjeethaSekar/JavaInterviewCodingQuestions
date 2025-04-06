package InterviewQuestions;
import java.util.HashMap;

public class removingintfromstring {
	
	public static void main(String[] args)
	{
		
		int[] arr = {1, 5, 2, 5, 6, 8, 9, 2}; 
		 HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		 // Count frequency of each number
		 for (int num : arr) { 
		 frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1); 
		}

		 // Print numbers that appear only once 
		 System.out.print("Output is: "); 
		 for (int num : arr) { 
		 if (frequencyMap.get(num) == 1) { 
		 System.out.print(num + " "); 

		 }
		 }

	}
}


