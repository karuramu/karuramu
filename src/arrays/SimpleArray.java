package Arrays;

public class SimpleArray {

	public static void main(String[] args) {

		String fruits[] = { "Apple", "Banana", "Cherry" };

		// there is code redendency in here

//		System.out.println(fruits[0]);
//		System.out.println(fruits[1]);
//		System.out.println(fruits[2]);

		// we can use for loop to eliminate code redendency as below

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}
}
