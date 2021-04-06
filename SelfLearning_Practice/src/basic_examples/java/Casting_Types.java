package basic_examples.java;

public class Casting_Types {
	
	public static void main(String args []) 
	
	{
		
		double x, y; // Declaration of variables
		byte b;
		int i;
		char ch;
		
		x = 10.0; //Assignment of values
		y = 3.0;
		
		i = (int) (x/y); //Truncation will occur in this conversion
		System.out.println("The value of x/y in integer is " + i);
		
		i = 100;
		b = (byte) i;// No loss of information here. A byte can hold the value of 100
		System.out.println("The value of i in byte is " + i);
		
		i = 257;
		b = (byte) i; // Loss of information in this conversion. A byte cannot hold the value of 257
		System.out.println("The value of i in byte is " + i);
		
		b = 88; // ASCII code for X
		ch = (char) b; // Cast between incompatible types
		System.out.println("The value of b in character is " + ch);
			
		
	}

}
