package innerclass;

// below rules is applied for only for local inner class
// we 	create more then one inner class in same class
//interface can used in local inner class
public class B1 {
	class A1// we can use inheritance to the inner class in above (classA1 extends classB1)
	// we can inherit member of outer class into inner class then access this
	// members by creating object of inner class
	{
		/*
		 * A1(){ System.out.println("sdfghs"); }
		 */
		int i = 10;
		/*
		 * we can use method also public void test(){ syso("from");} we can't create
		 * static variable & method in inner class (static int q=90;)
		 */
	}

	class B2 {
		int j = 55;
		// inheritance b/w two local inner class is possible(variable and method)
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b1 = new B1();
		A1 a1 = b1.new A1();
		B2 b2 = b1.new B2();
		System.out.println(a1.i);
		System.out.println(b2.j);
		// a1.test() for calling the method
	}
	/*
	 * inner class gives us better security we can't create static members in local
	 * inner class both variables and methods
	 */
}
