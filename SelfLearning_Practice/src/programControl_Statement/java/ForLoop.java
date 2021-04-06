//NOTE:  Use a for loop when performing a known number of iterations based on the value of a loop control variable. Use the do while
//when you need a loop that will always perform at least one iteration. The while is best used when the loop will repeat until some 
//condition becomes false.


package programControl_Statement.java;

public class ForLoop {
	
	public static void main(String[] args) 
	
	{
		int i;
		int sum = 0;
		
		for(i = 1; i<=5; sum+=i++); //No body in the loop
		//sum+=i++ is the same as i++;
		//                        sum=sum+i;
		
		System.out.println("Sum is "+ sum);
	}

}
