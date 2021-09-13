package multitasking;

/* threads - multitasking done at the prog level is called has threads
 * there are two ways to create the thread  1-thread class
 *                                      2- interface runnable
 *      Thread Class 
 * here we inherit RunMethod  from thread class and then we override it in user define class
 *  to start run thread we use start method of thread class
 *  run thread is user define thread 
 *  where has main thread is default thread  always  main thread run first then the user define thread later  exp                             
 */
public class A extends Thread {
	public void run() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println("task-1");
		}
	}

	public static void main(String[] args) {
		A a=new A();
		a.start();// to start the multitasking
		for (int j=0;j<=1000;j++) {
			System.out.println("task-2");
		}

	}
}
