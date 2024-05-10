
public class Test_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100,b=2,c;
			c=a/b;
			System.out.println(c);
			}
			catch (ArithmeticException ae)
			{
				ae.printStackTrace();
				System.out.println(ae);
				System.out.println(ae.toString());
				System.out.println(ae.getMessage() );
			}
		}
	}


