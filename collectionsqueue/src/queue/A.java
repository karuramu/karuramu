package queue;

import java.util.PriorityQueue;

/*public interface Queue<E> extends Collection<E>  
 * Queue
 * The Queue  interface basically order the element of FIFO(first in first out )manner
 * PiriotyQueue--
 * The PiriotyQueue class provides the facility of using Queue
 * But it doesn't order the element in FIFO manner
 */
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue q= new PriorityQueue();
q.add(10);
q.add(25);
q.add(100);
q.add(752);
System.out.println(q);

	}

}
