package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class B  {
	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue();
		q.add(56);
		q.add(25);
		q.add(100);
		
		q.add(752);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());

		// poll technique is read the element and give the control to next element
		// if all the data is read and we written in out put it will give null for all--
		// --extra poll in above example
	}
}
