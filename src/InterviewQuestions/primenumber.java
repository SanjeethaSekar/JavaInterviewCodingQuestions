package InterviewQuestions;

public class primenumber {
	
	
	public static boolean tofindprimenumber(int num)
	{
	
		
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					return false;
				}
			}
		
			return true;
			
		
		
			
		
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("This is prime number" +":" +" "+tofindprimenumber(5));
	

	}

}
