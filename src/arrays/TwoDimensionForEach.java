package arrays;

public class TwoDimensionForEach {

	public static void main(String[] args) {
		int[][] x = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i[] : x) {
			for (int j : i) {
				System.out.print(j+" ");

			}
			System.out.println();
		}
		
	}

}
