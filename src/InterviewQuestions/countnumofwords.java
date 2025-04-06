package InterviewQuestions;

import java.util.HashMap;
import java.util.Set;

public class countnumofwords {
	
	public static void main(String args[])
	{
		countnumofwords("hey java is a java programming java");
	}

	public static void countnumofwords(String input)
	{
		String s[]=input.split(" ");
		HashMap <String,Integer> hm = new HashMap<>();
		for(String word : s)
		{
			if(hm.containsKey(word))
			{
				hm.put(word, hm.get(word)+1);
			}
			else
			{
				hm.put(word, 1);
			}
		}
		System.out.println(hm);
		Set <String> s1 = hm.keySet();
		System.out.println(s1);
		for(String r : s1)
		{
			
			 if(hm.get(r)>1)
		        {
		            System.out.println("Duplicate word is " +hm.get(r) +r);
		        }
		}
       
	}
}
