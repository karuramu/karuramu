package supper;



public class B extends A{
	 
	public static void main(String[] args) {

	B b1=new B();
	b1.test();
	 System.out.println(b1.a);
}
public void test() {
//System.out.println(a);
//System.out.println(this.a);
	System.out.println(super.a);
}
}

 