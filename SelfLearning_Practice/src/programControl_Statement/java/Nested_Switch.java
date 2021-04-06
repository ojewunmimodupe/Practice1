package programControl_Statement.java;

public class Nested_Switch {

	public static void main(String[] args) 
	throws java.io.IOException
	{
	
		char choice;
		
		System.out.println("Need help on; ");
		System.out.println("If");
		System.out.println("Switch");
		System.out.println("Choose one: ");
		
		choice = (char) System.in.read();
		
		System.out.println();
		
		switch (choice) {
			case '1':
				System.out.println("The If Statement /n");
				System.out.println();
				System.out.println("if(condition) statement");
				System.out.println("else statement");
				break;
				
			case '2':
				System.out.println("The switch Statement /n");
				System.out.println("switch(expression) {");
				System.out.println("case constant");
				System.out.println("statement sequence");
				System.out.println("break");
				System.out.println("//....");
				System.out.println("}");
				break;
				
			default:
				System.out.println("Selection not found");
			}
		
		

	}

}
