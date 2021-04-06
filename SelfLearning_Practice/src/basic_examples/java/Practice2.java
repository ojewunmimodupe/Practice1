
//The moon’s gravity is about 17 percent that of earth’s. Write a program that computes your effective weight on the moon.

package basic_examples.java;

public class Practice2 {

	public static void main(String args [])  
	
	{
		
		double inches, meters;
		int count = 0;
		
		for(meters = 1; meters<=60; meters++) 
		
		{
			inches = meters*39.3701;
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
