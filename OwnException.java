//User_Exception object

public class OwnException 
{
	public static void main(String[] args)
	{
		 int x = Integer.parseInt(args[0]); 
		 int y = Integer.parseInt(args[1]); 
		 int z; 
		 try 
		 { 
			 z = x * y; 
			 if(z<0) //statement1 
			 throw new NegativeOutputException(z); 
			 System.out.println("Output: "+z); 
		 } 
		 catch (NegativeOutputException e) 
		{ 
			 System.out.println("Caught: "+e); 
		 } 
	 } 	
}