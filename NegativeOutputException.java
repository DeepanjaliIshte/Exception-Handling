// User_Define_Exception 

class NegativeOutputException extends Exception
{ 
	private int dsh; 
	NegativeOutputException(int a) 
	{ 
		dsh = a; 
	} 
	public String toString() 
	{ 
		return "NegativeOutputException["+dsh+"]"; 
	} 
} 