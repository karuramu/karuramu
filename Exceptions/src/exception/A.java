package exception;
// when a bad user i/p in given the prg halt abruptly  .
// halting a prg abruptly is exception
public class A {
public static void main(String[] args) {
	int i=10/0 ;
	System.out.println(i);
	System.out.println("completed");
	
}
}
// run the prg to see the exception in the console(result)
// Arithmetic Exp 