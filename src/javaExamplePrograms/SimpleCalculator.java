package javaExamplePrograms;

import java.util.Scanner;

public class SimpleCalculator {

	void addition(int value1, int value2) {

		int sum = value1 + value2;
		System.out.println("The sum of " + value1 + " and " + value2 + " is "
				+ sum);

	}

	void subtraction(int value1, int value2) {

		int sub = value1 - value2;
		System.out.println("The difference of " + value1 + " and " + value2
				+ " is " + sub);

	}

	void multiplication(int value1, int value2) {

		int mul = value1 * value2;
		System.out.println("The product of " + value1 + " and " + value2
				+ " is " + mul);

	}

	void division(int value1, int value2) {

		int div = value1 / value2;
		System.out.println("The Quotient of " + value1 + " and " + value2
				+ " is " + div);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("====Welcome=====");

		int option;

		SimpleCalculator calc = new SimpleCalculator();
		
		

		do {
			System.out.println("1) Addition");
			System.out.println("2) Subtraction");
			System.out.println("3) Multiplication");
			System.out.println("4) Division");
			System.out.println("5) Exit");

			

			System.out.println("Enter your choice: ");
			option = sc.nextInt();
			
			if (option==5){
				System.out.println("======thank you======");
				break;
			}
			
			if(option>5){
				System.out.println("=======invalid choice====");
				break;
			}
			
			System.out.println("Enter the value of value1");
			int value1 = sc.nextInt();
			System.out.println("Enter the value of value2");
			int value2 = sc.nextInt();
			
			
			switch (option) {
			case 1:
				calc.addition(value1, value2);
				break;

			case 2:
				calc.subtraction(value1, value2);
				break;

			case 3:
				calc.multiplication(value1, value2);
				break;

			case 4:
				calc.division(value1, value2);
				break;

			default:
				System.out.println("======Thank you=======");
				break;
			}

		} while (option != 5);

	}

}
