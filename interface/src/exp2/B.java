package exp2;

public class B implements A {
public void test1() {
	System.out.println("from test");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new B(); 
a.test1();
	}

}
