package InterviewQuestions;
	
	public class duplicateelements {

	    public static void main(String[] args) {
	    	
	        String input = "This is a test string with test words and is a duplicate string";

	        // Split the input string into words using space as a delimiter
	        String[] words = input.split(" ");

	        // Outer loop to pick words one by one
	        for (int i = 0; i < words.length; i++) {
	            boolean isDuplicate = false;

	            // Inner loop to compare the picked word with the remaining words
	            for (int j = i + 1; j < words.length; j++) {
	                // If a duplicate word is found, set the flag and break the loop
	                if (words[i].equalsIgnoreCase(words[j])) {
	                    isDuplicate = true;
	                    // Mark the duplicate word as processed (optional)
	                    words[j] = ""; 
	                    break;
	                }
	            }

	            // If the word is found to be duplicate and not empty, print it
	            if (isDuplicate ) {
	                System.out.println("Duplicate word: " + words[i]);
	            }
	        }
	    }
	}


