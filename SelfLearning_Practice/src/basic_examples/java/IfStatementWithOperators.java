
//This program demonstrate if statement with operators 

package basic_examples.java;

public class IfStatementWithOperators {
	
	public static void main(String args []) 
	{
		
		int a, b, c; //Declaration of variables
		
		a = 2; // Assignment of values
		b = 3;// Assignment of values
		c = a-b;// Assignment of values
		
		if(a<b) System.out.println("a is less than b");// if statement
		if(a==b) System.out.println("This is false"); // This will not print out anything because its false
		System.out.println(); // print blank line
		System.out.println("c contains -1");
		System.out.println(); // print blank line
		if(b>a) System.out.println("b is greater tha a"); // if statement
		if(a>=b)System.out.println("This is false");  // This will not print out anything because its false
		System.out.println(); // print blank line
		if(c<0) System.out.println("c contains a negative number"); // if statement
		
		
		
	}

}
