package javaExamplePrograms;

public class DecrementOperation
{

	public static void main(String[] args) {
		
		int x =1;
		// pre decrement
		System.out.println("===pre decrement====");

		System.out.println(--x); // o/p = 0
		
		x = 1;
		int result = 10 + --x; 
		System.out.println(result); //o/p = 10
		
		//post decrement
		System.out.println("===post decrement====");
		x = 1;
		System.out.println(x--); // o/p = 1
		System.out.println(x);  // o/p = 0
		
		x = 1;
		result = 10 + x--; 
		System.out.println(result); //o/p = 11
		
		
		
		 
		 
		 
		 
		 
	}
}
