package loops;

import java.util.Scanner;

// when the number of iterations are not known
public class WhileLoopExample {
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		int sum = 0;
		
		while (sum<=9) {		// before executing the body condition is checked
			System.out.println("Enter value");
			sum = sum + scr.nextInt();  // nextInt() is used accept integer value from user
		}
		
		System.out.println("Sum = "+sum); // displays the sum value after executing while loop
		
	}

}
