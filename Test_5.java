
public class Test_5 {

	public static void main(String[] args) {
		try {
		//	int a=100,b=0,c;
			int a=100,b=2,c;
			c=a/b;
			System.out.println(c);
			}
			catch (ArithmeticException e)
			{
				//System.out.println(e);
				System.out.println("Exception : "+e);
				}
		finally {
			System.out.println("Hello,I'm Finally block");	
		}
	
	}

}
