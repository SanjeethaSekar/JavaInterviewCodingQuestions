package InterviewQuestions;

public class duplicatecharcters {

		
		public static void main(String[] args) {
		     
	        String str ="Sanjeetha";
	        char c[]= str.toCharArray();
	        boolean isduplicate =false;
	        char Duplicatechar ='\0';
	        
	        for(int i=0;i<c.length;i++)
	        {
	            for(int j=i+1;j<c.length;j++)
	            {
	                if(c[i]==c[j])
	                {
	                    
	                    isduplicate = true;
	                    Duplicatechar =c[i];
	                    c[j]='\0';
	                    break;
	                }
	              
	            }
	        
	       
	       
	       if(isduplicate)
	       {
	           System.out.println("Duplicate charcter are" +Duplicatechar);
	       }
	        }
	      

	}

}
