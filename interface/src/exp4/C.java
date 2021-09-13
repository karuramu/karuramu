package exp4;

public class C  extends B implements A{
	public void test() {
		System.out.println("from extra");
	}
public static void main(String[] args) {
	C c1 =new C();
	c1.test();
	c1.test1();
}
}
