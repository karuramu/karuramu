package waitnoitify;

public class B2 extends Thread {

	
	 int balance;

	public void run() {
		for (int j = 0; j < 1000; j++) {
			balance = balance + j;
		}
		notify();
	}
}
