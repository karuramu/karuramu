package exceptionarray;

import java.lang.reflect.Array;

//short of array ex
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[3];
		a[0] = 10;
		a[1] = 500;
		a[2] = 1;
		Array.setShort(a, 0, (short) 50);
		Array.setShort(a, 1, (short) 10);
		Array.setShort(a, 2, (short) 1);
		
	

		for (int i : a) {
			System.out.println(i);
		}
	}

}
