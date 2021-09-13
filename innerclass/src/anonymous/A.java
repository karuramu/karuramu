package anonymous;

public class A {
	class D {
		int o = 25;
	}

	/*
	 * class without any name is know as anonymous class
	 */
	public static void main(String[] args) {
		A a = new A();
		D a1 = a.new D() {
			/*
			 * the above line where local variable of local inner class is written in the
			 * anonymous inner class
			 * 
			 */

		};
		System.out.println(a1.o);
		C a2 = new C() {
			public void test() {
				System.out.println("from test");

			}
			/*
			 * the above line where interface class is used in anonymous inner class
			 * 
			 */
		};
		a2.test();

	}
	/*
	 * anonymous class can inherit the members of any other class , any other--
	 * --interface ,local inner class ,static inner class but can't inherit member of
	 * --outer class
	 * anonymous class will inherit then override  only then use key rule in anonymous class
	 */

}
