package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList a = new LinkedList();
		a.add(10.5);
		a.add("hj");
		a.add(25);
		Iterator itr = a.iterator();// Iterator is used for read the data from any collections
		while (itr.hasNext())// hasnext() give the pointer to array where data stored it check whether data
								// is present or not
		{
			System.out.println(itr.next());// next in line the iterator pointer move
		}

	}

}// similar methods can use as same as array list
