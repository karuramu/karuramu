package arrays;

import java.util.Scanner;

public class TwoDimension {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows, cols;
		System.out.println("how many rows?");
		rows = Integer.parseInt(in.next());

		System.out.println("how many columns?");
		cols = Integer.parseInt(in.next());
		int x[][] = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			System.out.println("enter row" + (i + 1)+"elements");
			for (int j = 0; j < cols; j++) {
				x[i][j] = Integer.parseInt(in.next());
			}
		}
		System.out.println();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
