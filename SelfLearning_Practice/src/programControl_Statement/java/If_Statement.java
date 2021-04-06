
//This program print out the key a user entered using if statement

package programControl_Statement.java;

public class If_Statement {
	
	public static void main(String args []) 
	throws java.io.IOException 
	
	{
		
		char ch, answer = 'k';
		
		System.out.println("I am thinking of an alphabelt...");
		System.out.print("Guess the letter: ");
		
		ch = (char) System.in.read();
		
		if(ch==answer) System.out.println("Your guessed right!");
		
		else System.out.println("Sorry, you are wrong");
		
		
		
	}

}
