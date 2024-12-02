package InterviewQuestions;

public class smallestandlargestnumberinarray {
	
	public static void main(String[] args)

	{
		int a[] = { 1, 4334343,-89,343,0};
		int largest = a[0]; //assuming the first element of array is largest
		int smallest =a[0]; //assuming the first element of array is smallest
		
		//iterate through the array
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			else if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("The largest number is" +largest);
		System.out.println("The Smallest Number is" +smallest);
	}
}
