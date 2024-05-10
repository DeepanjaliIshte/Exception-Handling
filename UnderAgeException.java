
			// Checked Exception OR Compile-time Exception

public class UnderAgeException extends Exception {
	 UnderAgeException() {
		// TODO Auto-generated constructor stub
		super("You are under age");
	}
	UnderAgeException (String Message)
	{
		super(Message);
	}
}
	
class Vote
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=26;
		try
		{
			if(age<18)
			{
				//create new exception 
				throw new UnderAgeException("You cannot vote asyour age is below 18");
			}
			else
			{
				System.out.println("You can vote now...!!");
			}
		}
		catch(UnderAgeException e)
		{
			e.printStackTrace();
		}
	}
	
	StringBuffer

}
