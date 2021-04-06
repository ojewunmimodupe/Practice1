
/*Display 12 feet of conversions, inch by inch. Output a blank line every 12 inches. (One meter equals approximately 39.37 inches.)*/

package basic_examples.java;

public class Exercise {
	
	public static void main(String args []) 
	
	{
		double inches, meters;
		int count = 0;
		
		for(meters = 1; meters <= 60; meters++) 
		{
			inches = meters*39.37;
			
			System.out.println(meters + " meters is " + inches + " inches");
			count++;
			
			if(count==12) 
				
			{
				System.out.println();
				count = 0;
				
				
			}
			
						
		}
		
		
		
	
	}
	

}
