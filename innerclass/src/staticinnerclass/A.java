package staticinnerclass;

/*it is upgrade version of local inner class it over come drawbacks of local inner class
 * in this class we can keep static and non static variables both
 * we create sib  also iib & constructor
 */
public class A {
	static class B {
		/*in side static class we create sib ,iib,constructor
		 * 
		 */
	static	{
			System.out.println("SIB");
		}
		static int s;
		{
			System.out.println("IIB");
		}
		int k = 89;
		B(){
			System.out.println("constructor");
		}
	}

	public static void main(String[] args) {
		B a1 = new B();
		System.out.println(B.s);
		System.out.println(a1.k);
	}
}
