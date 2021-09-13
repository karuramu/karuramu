package threadlifecycle1;
/*which thread will be executive by depend on priority
 * priority is classified into NORM_PRIORITY(represents value 5)
 *                             MAX_PRIORITY(represents value 10)
 *                             MIX_PRIORITY(represents value 1)
 * priority written in prg is request for jvm
 * when a programmer set a priority it is request
 * but when priority is set internally its a command
 */
public class B  extends Thread{

	public void run() {
		System.out.println("running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b1 =new B();
b1.start();
b1.setPriority(MIN_PRIORITY);
System.out.println(b1.getPriority());
b1.setPriority(MAX_PRIORITY);
System.out.println(b1.getPriority());
b1.setPriority(NORM_PRIORITY);
System.out.println(b1.getPriority());


	}
/*thread concepts are ideally use for sever side implentain to build application like tomcat
 * for ever incoming request a thread will be picked up from thread pool and will be assigned 
 * to handle the request thread pool is collections of threads when a request is handled using a thread we
 * can perform multitasking and hence it will give fell to user that all the request are being process at once
 * once a request is handled we put thread back to thread pool every time we don't create a thread and destroy the thread bcz that will reduce the efficiency
 * rather after usage of thread it will stored back in thread poll for further re-usage .this help us to increases efficiency and performs for server
 * 
 */
}
