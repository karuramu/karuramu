package threadsynchronzie;

/* synchronized
 * if a method is made synchronized then a thread which acquire the object lock can only executive the method
 * every object  will have only one lock
 * which ever thread acquire a lock will executive  synchronized method while the other thread has to wait for the lock to realized.
 *   thread will release the lock only after complete execution by doing this we assure that once particular thread  executed completed only then next thread can start
 *   this will avoid data corruption common data 
 */
public class C {
	
		int balance;

		public static void main(String[] args) {
			C a1 = new C();
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
				t1.join();
				t2.join();
			}catch(Exception n) {
				System.out.println(n);
			}
		}

		public  synchronized void add() {
			for (int i = 0; i <= 1000; i++) {
				balance = balance + i;
			}

		}

		public  synchronized void sub() {
			for (int i = 0; i <= 1000; i++) {
				balance = balance - i;
			}
		}
	}

