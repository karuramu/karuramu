package generics;

/*
 *  a generic class help us to create  a variable such that any kind of value can be stored in that variable as
 *   data type of variable is decide based on the kind of value is stored in it 
 */
public class A<x > {
x i;
x j;
public static void main(String[] args) {
	A a1 =new A();
	a1.i=10;
	a1.j="a";
	a1.i=10.3;
	System.out.println(a1.i);
	System.out.println(a1.j);
}
/*this was introduce in jdk 1.5
 * the above prg i value will run latest value
 * 
 */

}
