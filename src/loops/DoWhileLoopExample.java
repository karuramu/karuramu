
//When we want to execute the statement at least once irrespective of condition
// For menu driven application Do-While loop is suitable


package loops;

import java.util.Scanner;

public class DoWhileLoopExample {

	public static void main(String[] args) {
		Scanner scr =  new Scanner(System.in);
		int x;
	
		
		do {
			System.out.println("1) Addition");
			System.out.println("2) Subtraction");
			System.out.println("3) Multiplication");
			System.out.println("4) Division");
			System.out.println("5) Exit");
			
			System.out.println("Enter your choice: ");
		x = scr.nextInt();
			
		} while (x!=5);
		
		System.out.println("Loop ended");
		
	}
}
