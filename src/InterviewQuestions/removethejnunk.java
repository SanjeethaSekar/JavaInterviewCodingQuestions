package InterviewQuestions;

public class removethejnunk {
	
	public static void main(String[] args)
	{
		String s = "#223java@@@@@test";
		//before removing the junk characters
		System.out.println(s);
		//to remove the junk characters, we need to use replaceall method which is available in string and use regular expression.
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
			
	}

}
