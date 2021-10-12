package Arrays;

import java.util.Scanner;

public class SimpleArray1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Array Size");
		int size = Integer.parseInt(sc.next());
		// int size = sc.nextInt(); we can use this funvtion as well.

		int x[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter element" + (i + 1));
			x[i] = Integer.parseInt(sc.next());
		}
		System.out.println();
		System.out.println("Your Array is");

		for (int i = 0; i < size; i++) {
			System.out.println(x[i]);
		}

	}
}
