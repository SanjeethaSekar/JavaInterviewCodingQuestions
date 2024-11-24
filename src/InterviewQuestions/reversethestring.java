package InterviewQuestions;

public class reversethestring {
	
	public static void main(String args[])
	{
		String s ="Sanjeetha",rev ="";
		char[] c = s.toCharArray();
		//System.out.println(c.length);
		//using for loop and starting from 0th index
		for(int i=0;i<c.length;i++)
		{
			rev=c[i]+rev;
			
		}
		
		System.out.println(rev);
		
		//using for loop and starting from last index
		for(int j=c.length-1;j<=0;j++)
				{
				rev =rev+c[j];
				}
		System.out.println(rev);
		
		//using stringbuffer class
		
		StringBuffer sb = new StringBuffer(s);
		StringBuffer revs =sb.reverse();
		System.out.println(revs);
}
}