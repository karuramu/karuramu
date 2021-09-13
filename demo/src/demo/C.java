package demo;
/**
 * how to created static ref so that ref variable is used in any where 
 * in the code 
 * any variable that created with a method it become a local variable
 *
 */

public class C {

	static C c1;// static ref variable  is created  
	int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c1=new C();// creating  a object 

System.out.println(c1.i);
c1.test1();
	}
	public void test1() {
		System.out.println(c1.i);

	}

}
//ref variable are used to memory addrs , it can never store any ordinary value
//local ref variable they are created with in method and should be used only with in created method
/* class A(){
* int i=10;
* psvm(){
* A a1=new A();
* s.o.p(a1.i);
* a1.test();
* }
* public void test(){
* s.o.p(a1.i);
* out put is error bcz we are using local ref variable outside (where ref variable is created)
*/