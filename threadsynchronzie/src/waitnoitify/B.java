package waitnoitify;

public class B extends Thread {
	int balance;
	public void run() {
		for(int i=0;i<1000;i++) {
			balance=balance+i;
		}
	}

}
