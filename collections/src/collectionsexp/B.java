package collectionsexp;

import java.util.ArrayList;
import java.util.Collections;

// for search data must be sort
// to perform search in a collection make sure the data is sorted
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		/*
		 * a.add(45); a.add(55); data should be in sorted order has shown below
		 * a.add(10); Collections.sort(a);
		 */

		a.add(55);
		a.add(65);
		a.add(75);
		// when we use binarysearch the data should be sort in below line int index give
		// is index number where data stored
		int index = Collections.binarySearch(a, 65); // binarysearch will check the data and give the index number
		System.out.println(a.get(index));
		System.out.println(a.contains(65));// contains will give whether written data present or not
		System.out.println(a.contains(200));
		a.remove(2);// remove key word is used for to remove the value of index written
		System.out.println(a);
	}

}
	