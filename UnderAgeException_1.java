
		//Unchecked Exception OR Runtime Exception

public class UnderAgeException_1 extends RuntimeException
{	 
	UnderAgeException_1 ()
	 {
		// TODO Auto-generated constructor stub
		super("You are under age");
	}
	UnderAgeException_1 (String Message)
	{
		super(Message);
	}
}
	
class Voter
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=26;
		try
		{
			if(age<18)
			{
				System.out.println("You cannot vote asyour age is below 18");
			}
			else
			{
			//create new exception 
			throw new UnderAgeException_1("You cannot vote asyour age is below 18");
			
			//System.out.println("You can vote now...!!");
			}
		}
		catch(UnderAgeException_1 e)
		{
			e.printStackTrace();
		}
	}

}
