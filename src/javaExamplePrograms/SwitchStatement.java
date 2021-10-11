package javaExamplePrograms;

/*syntax -

switch (key) { key = byte, short, int ,char, enum, string
case value:
	
	break;

default:
	break;
}*/

//break statement is not compulsory, based on requirement we can use it
//Default block is not compulsory, based on requirement we can use 


public class SwitchStatement {
	public static void main(String[] args) {
		
		char c = '+';
		
		switch (c) {
		case '+':
			System.out.println("Addition");
			break;
			
		case '-':
			System.out.println("Subtraction");
			break;
			
		case '*':
			System.out.println("Multiplication");
			break;
			
		case '/':
			System.out.println("Division");
			break;

		default:
			System.out.println("Invalid Entry");
			
		}
		
	}

}
