package javaExamplePrograms;

public class IfAndIfElseStatement {
	public static void main(String[] args) {
		
		// simple if statement
		System.out.println("======If statement==========");
		if(Character.isDigit('2'))  // Character = built in class, isDigit = built in static method
		{
			System.out.println("Digit");
			
		}
		
	
		//if else statement
		System.out.println("======If else statement==========");

		if(Character.isDigit('2'))  // Character = built in class, isDigit = built in static method
		{
			System.out.println("Digit");
		}
		else{
			System.out.println("It is not a Digit");
		}
		
		int x =2,y=1;
		
		if (x>y) {
			System.out.println(x>y); //true
		} else {
			System.out.println(x>y); //false
		}
		
	}

}
