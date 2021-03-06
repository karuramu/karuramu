package threadsynchronzie;

/*when two threads are operating  on common data in non synchronized manner then the data will corrupted ``
 * below exp prg
 * 	
 */
public class A {
	int balance;

	public static void main(String[] args) {
		A a1 = new A();
		a1.account();
		System.out.println(a1.balance);
	}

	public void account() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				add();// this.add();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				sub();// this.sub();
			}
		});
		t1.start();
		t2.start();
		try {
			// thread joint it help us to join the operation or task of two or more threads 
			t1.join();
			t2.join();
		}catch(Exception n) {
			System.out.println(n);
		}
	}

	public void add() {
		for (int i = 0; i <= 1000; i++) {
			balance = balance + i;
		}

	}

	public void sub() {
		for (int i = 0; i <= 1000; i++) {
			balance = balance - i;
		}
	}
}