package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class duplicatearrayelement {

	public static void main(String[] args) {
		
		String s[]= {"Java","Javascript","Ruby","C#","Java"};
		int len= (s.length)-1;
		System.err.println(len);
		
		//using two for loops
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;i<len;j++)
			{
				if(s[i].equalsIgnoreCase(s[j]))
				{
					//System.out.println("Duplicate Element is " +s[i]);
				}
			}
		}
		
		//using Set Interface in collections = set will not store duplicate values
		
		Set <String> store = new HashSet <String>();
		
		for(String s1 : s)
		{
			if(store.add(s1)==false)
			{
				System.out.println("Duplicate Element is" +s1);
			}
		}
		
		
		
	}

}
