package loops;


/*when the exact iteration are known 
 * entry controlled loop

Syntax
for (initialization; condition; expression(increment/decrement)) {
	----------
	----------
	----------
	statements
	
}
*/

public class ForLoopExample {
	
	public static void main(String[] args) {
		
		/*for (int i = 1; i <= 10; i++) {
			
			System.out.println(i); // print the number from 1 to 10
		}*/
		/*
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Good Morning");  // Good morning is displayed !0 times
		}
		*/
/*
		for (int i = 1; ; i++) {
			
			System.out.println("Good Morning");  // when the condition is unknown, the loop will get
												 // executed infinite times
		}*/
		

		/*for (;;) {
			
			System.out.println("Good Morning");  // when no arguments are mentioned, loop executed infinite times
		}
		*/
		

		/*for (int i = 1; false; i++) { // throws compilation error
			
			System.out.println("Good Morning"); 
		}
		*/
		

		/*for (int i = 1; true; i++); { // throws compilation error - Unreachable statement
			
			System.out.println("Good Morning");  // Good morning is displayed !0 times
		}
		*/

		for (int i = 1; true; i++) { // loop executed infinite times
			
			System.out.println("Good Morning");  // Good morning is displayed !0 times
		}
		
	}

}
