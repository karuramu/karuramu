
public class Supper {
static //using super key word we can access member of parent class ex
	int i=10;
}
class B extends Supper{
	public static void main(String[] args) {
		B b1=new B();
		b1.test();
		  
	}
	public void test() {
		System.out.println(Supper.i);
	}
}