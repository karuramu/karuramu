package queue;

import java.util.PriorityQueue;

public class D {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		q.add(10);
		q.add(25);
		q.add(100);
		q.add(752);
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.contains(100));
	}
	/*
	 * where the peek will write the element and poll (bcz peek is all ready written--
	 * --the element so it will read)read and it will give control to the next element
	 * 
	 */
}
