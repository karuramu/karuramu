package annotations;

public class B extends A {
	@Override
	public void test() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new B();
		b1.test();
	}
	/*
	 * annotations set of instruction given to the complier during compilation
	 * annotations introduce jdk 1.5 we have got following
	 * annotations @override @Suppresswaring @ Deprecated
	 * 
	 */
}
