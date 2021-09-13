package polymonphism;

public class B extends A {
	public void test()// inheritance used for overriding method
	// above line is overriding
	{
		System.out.println("B");
	}
public static void main(String[] args) {
	B b1=new B();
	b1.test();
}
}
// run time polymonphism (A.java-->A.class-->run)
// while overriding if u are increasing scope of access specifier than it will not give any error 
/*access specifier are 1-private(inheritance is not possible)
 *                     2- default(inheritance only in same package)
 *                     3-protected(in same or different package trough inheritance )
 *                     4-public(we can use any package )
*/