package annotations;

public class D {
	@ Deprecated
	// it help us to notify that the particular method is not in use 
	// but still we can call deprecated method
	public void test() {
		System.out.println("410");
	}
	public static void main(String[] args) {
		D d1 =new D();
		d1.test();
	}
}
