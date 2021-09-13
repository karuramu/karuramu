package threadlifecycle;

//sleep  have specific time then it automatic become runnable
public class A {
	public static void main(String[] args) {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("testing");
	}
	/*when two thread are waiting for each other to release the lock and neither of thread  is release is lock then 
	 * this threads has got into deadlock state 
	 */
	/*                      THREAD LIFE CYCLE
	 * plz see the screen shot of thread or pankaj sir java video 47(time 16:56)
	 * 
	 */
}
