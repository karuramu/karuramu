package completeabstractimplements;

public class C extends B implements A {

	public static void main(String[] args) {
		C c1 =new C();
		c1.test();
		c1.test1();
	}
	@Override
	public void test()
	{
		System.out.println("inteface");
	}
	@Override
	public void test1()
	{
		System.out.println("abstract");
	}

}
