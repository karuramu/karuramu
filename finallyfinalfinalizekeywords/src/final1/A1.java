package final1;
/*if you make array as final then its size can't be alter
 * when we change size we will get error but when we alter the value we don't get error
 * below example
 */
public class A1 {
// if we make class as final then its value can't able to inheritance
	// final class can inherit members of non final class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
final int[] a=new int[3];
a[0]=10;
a[0]=20;
System.out.println(a[0]);
	}

}
//String [] args help us to supply command line arguments 
