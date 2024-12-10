package InterviewQuestions;

public class swappingtwointegers {

	public static void main(String[] args) {

		
		//using third variable
		int swap;
		int x=10;
		int y=5;
//		swap=y;
//		y=x;
//		x=swap;
//		
//		System.out.println(x);
//		System.out.println(y);

		
		//without using third variable - by using arithmetic operator 
		
//		x=x*y;
//		y=x/y;
//		x=x/y;
//		
//		System.out.println(x);
//		System.out.println(y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
	}

}
