package exception;
/*  number format exp
 * an  invalid conversion of  string into number leads to number format exp
 * in this only integer is used to convert string to number
 * ex-1 with exp ex-2 without exp
 */
public class C {

	public static void main(String[] args) {
		String s="from main ";
		int i=Integer.parseInt(s);
		System.out.println();
	}

}
// for resolve exp we use try catch block