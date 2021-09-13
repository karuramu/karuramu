/**
 * 
 */
package polymonphismOverloading;

/**
 * @author karthik
 *A.java-->A.class 
 */
public class A {

	public void test() {
		System.out.println("test");
	}
	
	public void test(int a,int b) {
		System.out.println(a);
		System.out.println(a);
	}
	public static void main(String[] args) {
		A a1=new A();
		a1.test(10,10);
	}
}
// here we create multiple methods with a same name but then are differentiate based on number and type of arguments 
