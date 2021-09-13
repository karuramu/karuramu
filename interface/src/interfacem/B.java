package interfacem;
/*we inherit member of interface which is incomplete and than we override it with a complete method in the sub-class
 * 
 */
public class B implements A
{
	public void test() {
		System.out.println("from test");
	}

	public static void main(String[] args) {
B b=new B();
b.test();
	}

}
