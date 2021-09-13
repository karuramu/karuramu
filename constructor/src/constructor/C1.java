package constructor;
// rule of constructor 
// constructor by always is void but method can be void or it can return the value
//the return type of constructor is always void and hence wecan use only return key word in it but then we can't return the value
// ex 
/*
 * class A(){
 * A(){
 * s.o.p ("a");
 * return 30;}
 * psvm{
 * A a1=new A()
 *} 
 * 
 */
public class C1{
C1(){
	System.out.println("return");
	return ;
	
}
public static void main(String[] args) {
	C1 c=new C1();
	System.out.println("RULE");
}
}
