import java.util.Scanner;

public class YoungerAgeException extends RuntimeException
	{
		public YoungerAgeException(String msg) {
			// TODO Auto-generated constructor stub
			super(msg);
		}
		
	}
	class voting
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		
		try
		{
			if(age<18)
			{
				throw new YoungerAgeException("You are not eligible fo voting");
			}
			else
			{
				System.out.println("Vote Successfully");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Done the process");
	}

}
