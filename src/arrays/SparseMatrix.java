package arrays;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows = 0, cols = 0;
		System.out.println("how many rows?");
		rows = Integer.parseInt(in.next());
		int[][] x = new int[rows][];
		for (int i = 0; i < rows; i++) {
			System.out.println("How many columns in row" + (i + 1) + "elements");
			cols=Integer.parseInt(in.next());
			x[i] = new int[cols];
		}

		for (int i = 0; i < rows; i++) {

			System.out.println("enter row" + (i + 1) + "elements");
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = Integer.parseInt(in.next());
			}
		}
		System.out.println();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < x[i].length; j++) {
 System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}

}
