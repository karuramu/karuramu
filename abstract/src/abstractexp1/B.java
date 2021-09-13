package abstractexp1;

public class B extends A {

	public static void main(String[] args) {
	
A a1=new B();
a1.test();
	}
/*a constructor can be created in abstract class
 * 
 */
	@Override
	public void test() {
		System.out.println("from abstract");
	}
	B(){
		super();
	}
}
