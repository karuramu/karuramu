package linkedlist;

import java.util.LinkedList;

/*singly linkedList  
 * here traversal to read the data happens only in one direction 
 * and hence its is called has singly linkedList  below exp
 * 
 * in notes
 *  double linked list
 *   here the reading of data can be done in both the directions ex in notes
 *  can contain duplicate data
 *  maintains insertion order 
 *  it's internally implemented as doubly linked list
 */
public class A {

	public static void main(String[] args) {
		LinkedList a= new LinkedList();
		a.add(10.5);
		a.add("hj");
      a.add(25);
      System.out.println(a);
	}
}
