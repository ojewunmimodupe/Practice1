package programControl_Statement.java;

public class ReadKeyboard {
	
	public static void main(String args []) 
	throws java.io.IOException
	{
		
		char ch;
		
		System.out.print("Press a key followed by enter: " );
		
		ch = (char) System.in.read();
		
		System.out.println("Your key is " + ch);
	}
	
	

}
