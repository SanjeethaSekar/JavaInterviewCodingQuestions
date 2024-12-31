package InterviewQuestions;

public class factorialnumber {

	public static void main(String[] args) {
	
		tofindfactorial(4);
		

	}
	
	public static void tofindfactorial(int num)
	{
		int fact =1;
		for(int i =num;i>1;i--)
		{
			
			fact =  fact *i;
		}
		
		System.out.println("The factorial of" + num +""+"is" + fact);
	}

}
