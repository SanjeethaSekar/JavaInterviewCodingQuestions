package InterviewQuestions;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class findmissingelement {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		int exp=0;
		int actual =0;
		int missingelement;
		
		//given integers from 1 to 6 in an array 
		//need to find the missing element in the array
		
		for(int i =0;i<=8;i++)
		{
			exp=exp+i;
		}
		
		for(int j=0;j<=a.length-1;j++)
		{
			actual=actual+a[j];
		}

		missingelement = exp-actual;
		System.out.println(missingelement);

	}

}
