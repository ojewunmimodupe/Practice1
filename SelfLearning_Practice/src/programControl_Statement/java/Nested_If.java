
//This program print out the key a user entered using Nested if statement

package programControl_Statement.java;

public class Nested_If {
	
	
	public static void main(String args []) 
			throws java.io.IOException 
			
			{
				
				char ch, answer = 'k';
				
				System.out.println("I am thinking of an alphabelt...");
				System.out.print("Guess the letter: ");
				
				ch = (char) System.in.read();
				
				if(ch==answer) System.out.println("Your guessed right!");
				
				else System.out.println("Sorry, you are wrong");
				
				if(ch<answer) System.out.println("The letter is too low");
				else System.out.println("The letter is too high");
				
				
				
			}


}
