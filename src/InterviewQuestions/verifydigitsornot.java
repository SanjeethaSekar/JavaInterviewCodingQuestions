package InterviewQuestions;

public class verifydigitsornot {

	public static void main(String[] args) {
		
		isdigitornot("123ddd");

	}
	
	public static void isdigitornot(String s)
	{
		char c[]=s.toCharArray();
		StringBuilder str = new StringBuilder();
		for(char d : c)
		{
			if(!Character.isDigit(d))
			{
				str.append(d);
				
				
			}
		}
		System.out.println(str);
		
	
	}

}
