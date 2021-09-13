package assertjava;
/*assert-help us to check the business condition only if business  condition is true assert will continue the prg execution 
 * but if condition is false then assert is not going to continue with its execution 
 * assert was introduce in JDK version in 1.4
 * steps to configure or enable assert 
 * steps1- to run drop down Select run configuration  and go to arguments  in VM arguments set -ea (enable)
 * to disable assert change -ea into -da 
 * if condition fail it throws  Exception AssertionError
 * 
 */
public class A {
	public static void main(String[] args) {
		int j=20;
		assert j>20;
		System.out.println("assert is working");
	}

}
