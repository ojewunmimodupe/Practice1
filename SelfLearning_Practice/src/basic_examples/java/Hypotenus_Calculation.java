
//This is a program to calculate hypotenuse

package basic_examples.java;

public class Hypotenus_Calculation {

	public static void main(String args []) 
	{
		double x,y,z; // declaration of variables
		
		x = 3;        // Assign value
		y = 4;        // Assign value
		
		z = Math.sqrt(x*x + y*y); // This is how to call square function
		
		System.out.println("Hypotenuse is " + z);
		
	}
}
