
//This program illustrate declaration of variables, how to assign values and the difference between println() and print().

package basic_examples.java;

public class Variables_Values {
	
	public static void main(String args[]) 
	{
		int var1 =10; int var3 = 30;  //Declare variable and assign value
		int var2 = 20;  //Declare variable and assign value
		
		System.out.println("The value of var1 is " +var1); //println(), prints and move to next line
		System.out.print("The value of var3 is "+ var3 +" and "); // print(), prints without moving to the next line
		System.out.println("the value of var2/var1 is "+ var2/var1);
		System.out.println();
		
		
		
		// This program illustrate the difference between int and double
		
		int var4 = 10; // Declaration of variable and assignment of value
		double var5 = 10.0; // Declaration of floating-point variable and assignment of value
		
		System.out.println("The original value of var4 is " + var4);
		System.out.println("The original value of var5 is "+ var5);
		System.out.println();  // Prints a blank line
		
		var4 = var4/4;
		var5 = var5/4;
		
		System.out.println("The value of var4 after division is " + var4); //int remove the fractional component in the output
		System.out.println("The value of var5 after division is " + var5); //double keep the fractional component
		
	} 

}
