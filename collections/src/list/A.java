package list;

import java.util.ArrayList;

/*                    list
 * its an interface
 * maintains insertion order
 * allows duplicate data
 * list consists of array list and linked list
 *                    Array list
 * it can contain duplicate items
 * it maintains insertion order
 * allow random access of data
 * Internally it is implements dynamic array
 * 
 */
public class A {
// exp of array list
	public static void main(String[] args) {
		
	
	ArrayList a=new ArrayList();
	a.add(45);
	a.add("arryalist");
	a.add(10.5);
	System.out.println(a);
	System.out.println(a.get(1));
	System.out.println(a.size());
	//for random access we write syso(a.get(index number));
}
	}
