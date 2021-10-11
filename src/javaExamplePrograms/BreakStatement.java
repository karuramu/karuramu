package javaExamplePrograms;

// when break is used in inner for loop, it will terminate that particular inner loop
// when break statement is used in outer for loop, both inner and outer loop will get terminated

public class BreakStatement {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {  
			System.out.println( i +" "); 
			
			if( i == 5)
			{
				break;   // used to exit the loop
			}
			
		}
		System.out.println("Main method.......");
	}

}
