package final1;
/*if you make a variable has final then we can never reinitialize  the that variable again in that prg
 * non static variable if made final then it is initialize or else we will get blank filed error
 */
public class A {
	final int i;//final int i; if we not initialize i we get an error line 2
	final static int i;//error
	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int i;//we will not error now but write syso(i) we get error
//int i=10;// or int i=20; or i++; not possible
System.out.println(i);
	}

}
