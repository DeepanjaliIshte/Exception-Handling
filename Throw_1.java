
public class Throw_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throw_1 t1=new Throw_1();	
		try {
		t1.divdie();
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		System.out.println("Hello");
	}
	void divdie()
	{
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);
	}
}
