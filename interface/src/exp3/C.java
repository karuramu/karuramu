package exp3;

public class C implements B {
 public void test() {
	 System.out.println("from test");
 }
	public static void main(String[] args) {
C c =new C();
c.test();
c.test1();
	}
	
	public void test1() {
System.out.println("asdfg");		
	}

}
