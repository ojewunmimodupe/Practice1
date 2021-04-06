
//This program is an example of block of to prevent zero division

package basic_examples.java;

public class BlockOfCode {
	
	public static void main(String args [])  
	{
		
		int e,f,g; //Declaration of variables
		e = 5;     //Assignment of value
		f = 10;    //Assignment of value
		
		if(e != 0); //If Statement
		{
			System.out.println("e is not equal to zero");   //Block of code
			g = f/e;                                        //Block of code
			System.out.println("f/e is equal to "+ g);       //Block of code
		}
	}

}
