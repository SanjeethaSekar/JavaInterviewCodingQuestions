package InterviewQuestions;

public class armstrongnumber {

	public static void main(String[] args) {
		
		tofindarmstrong(253);


	}

	public static void tofindarmstrong(int num) {
		
		int cube = 0;
		int t;
		t=num;
		
		while(num>0)
		{
		int r = num%10;
		num = num/10;
		cube= cube+(r*r*r);
		}
		
		if(t==cube)
		{
			System.out.println("It is a armstrong number");
		}
		else
		{
			System.out.println("This is not a armstrong number");
		}
		
	}
}
