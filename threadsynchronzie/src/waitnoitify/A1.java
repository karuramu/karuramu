package waitnoitify;

public class A1 {
	public static void main(String[] args) {
		B2 b2 = new B2();
		b2.start();
		 synchronized(b2) {
			 try {
				 b2.wait();
			 }catch(Exception e) {
				 System.out.println(e);
			 }
		 }
		System.out.println(b2.balance);
	}

}
