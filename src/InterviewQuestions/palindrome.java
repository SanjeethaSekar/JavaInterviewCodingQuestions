package InterviewQuestions;

public class palindrome {
	
	public static void tofindpalindrome(int num)
	{
		int rev=0;
		int t=num;
		while(t!=0)
		{
		rev=rev*10+t%10;  //0+1=1,10+5=15,150+1=151
		t=t/10; //15,1,0
		}
		System.out.println(rev);
		if(num==rev)
		{
			System.out.println("This is a palindrome number");
		}
		else
			System.out.println("This is not a palindrome number");
		
	}

	public static void main(String[] args) {
	
		tofindpalindrome(151);
	}

}
