package waitnoitify;

/*
 * wait ,notify,notifyall belongs to object class
 * wait - it will halt the execution of the thread 
 * notify- it will end the wait of any one thread so that it can resume it's execution 
 * notifyall- it will  the end wait of all the threads at once which are in waiting status 
 * threads will now executed in queue one after another ex
 */
// example with out using wait and notify in class A and class B
// using wait, notify,notifyall in class A1 &class B1
public class A {
	public static void main(String[] args) {
		B b1=new B();
		b1.start();
		System.out.println(b1.balance);
	}

}
