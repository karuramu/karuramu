package queue;

import java.util.PriorityQueue;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue q = new PriorityQueue();
		q.add(10);
		q.add(25);
		q.add(100);
		q.add(752);
		System.out.println(q.peek());
		System.out.println(q.peek());
		/*
		 * peek technique is read the element and it will not give control  to next element 
		 * output will be 10 and in next line 10 where control will not go to the next
		 * element
		 */

	}

}
