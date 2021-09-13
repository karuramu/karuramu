package runnable;

/*which thread will executed for how much time can't be predicted by programmer has its is decide by the processor depending on its availability
 * creating a thread using runnable interface
 */
public class A implements Runnable {
	public void run() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println("task-1");
		}
	}

	public static void main(String[] args) {
		A a = new A();
		Thread t1 = new Thread(a);// to start or make multitasking(Runnable) we need the start method which is present in
									// the Thread class so we create the Thread class object and call the start
									// method
		t1.start();
		for (int j = 0; j <= 1000; j++) {
			System.out.println("task-2");
		}
	}
}
