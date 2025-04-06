package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countnumberofrepeatingwords {
	
	public static void main(String[] args)
	{
		String str="hey java is a java programmming java";
		String s[] =str.split(" ");
		Map<String,Integer> m = new HashMap<>();
		for(String c : s)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
			
		}
		
		System.out.println(m);
		Set<String> se = m.keySet();
		System.out.println(se);
		for(String word : se)
		{
			if(m.get(word)>1)
			{
				System.out.println(word +m.get(word));
			}
		}
	}

}
