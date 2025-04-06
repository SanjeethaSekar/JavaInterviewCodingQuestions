package InterviewQuestions;

public class duplicatearrayintegers {
	
	public static void main(String[] args)
	{
		int a[]={1,4,2,1,5,4};
        int temp=0;
        boolean isduplicate = false;
        
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
            	 isduplicate = false;
            	
                if(a[i]==a[j])
                {
                    isduplicate=true;
                    temp = a[j];
                    break;
                }
            }
            
            if(isduplicate && !(temp==' '))
            {
            System.out.println("Duplicate element is" +" "+temp);
            }
             
        }
        
	}

}
