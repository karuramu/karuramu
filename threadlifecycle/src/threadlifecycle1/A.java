package threadlifecycle1;
// to see the current state of thread we use get state method of thread class

public class A  extends Thread {
public void run() {
	System.out.println("Running");
}
public static void main(String[] args) {
	A a1= new A();
	System.out.println(a1.getState());
	a1.start();
	System.out.println(a1.getState());
	try {
		Thread.sleep(5000);
	}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println(a1.getState());
}
}
