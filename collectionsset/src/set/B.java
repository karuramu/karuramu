package set;

import java.util.LinkedHashSet;

//linkedHAshsetis used for  to keep insertion order in hashset
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet h = new LinkedHashSet(30, 0.90f);
		h.add(25);
		h.add(10);
		h.add(5);

		System.out.println(h);
	}

}
