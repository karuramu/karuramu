package assertjava;

public class B {
	public static void main(String[] args) {
		int j=20;
		try {
		assert j>20;
		System.out.println("assert is working");
	}catch(AssertionError e) {
		System.out.println(e);
		System.out.println("sdfg");
	}
/*has programmer exceptions should be handle so we must write in try catch block 
 *so that prg will not halt  
 * 
 */
}
}