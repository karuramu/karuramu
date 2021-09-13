package constructor;
// this is key world which is used for ref of a object
// this key word can't use in the static method
// but it can used for calling static and non static variable
public class This {
int i=10;
static int j=20;
	public static void main(String [] arg) {
		// TODO Auto-generated method stub
This t=new This();
t.test();
	}
public  void test( )
{
 this.test1(); // j or i can used in this prg has written
System.out.println("from main");
}

public void test1() {
	System.out.println("er");
}
// this key world use for access static and non static methods and variable but not the local variable 
//this key is used for call constructor of same class but rules are this key should be very  first statement inside another constructor 
//while your are  calling  the constructor 
}
/*class A(){
 * A(){
 * s.o.p(A);
 * }
 * A(int i){
 * this();
 * s.o.p(i);
 * } 
 * psvm{
 * new A(100)
 * }
 *out put is A &100
 */ 
