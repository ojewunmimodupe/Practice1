
//This program print out the value of a variable using If else if ladder

package programControl_Statement.java;

public class If_Else_If_Ladder {

	public static void main(String[] args) {
		
		int x;
		
		for(x=1; x<6; x++) 
		{
			
			if(x==1) 
				System.out.println("x = 1");
			
			else if(x==2) 
				System.out.println("x = 2");
			
			else if(x==3) 
				System.out.println("x = 3");
			
			else if(x==4) 
				System.out.println("x = 4");
			
			else 
				System.out.println("The value of x is not between 1 and 4");
		}			
		
		

	}

}
