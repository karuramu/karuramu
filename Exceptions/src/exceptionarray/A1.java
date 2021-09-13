package exceptionarray;
/*array static array where length of array 
 * if you specify the size of array ideally its a static array
 * if you want memory to dynamic increase and decrease then we create dynamically array as shown below
 *int[] a={10,202,30,25,}//such that it will increase or decrease  according to user i/p 
 *above line similar for object class of array
 */
/*for each loop is only use for array ex for(int x:a) where int [] a=new int[3];a is array argument
 * for each is used for only read from array 
 * it will read in increment sequentially
 */
/*for loop can used in any java script
 * it use for both read and write into the array 
 * it can use for incremental and decrement
 */
public class A1 {
	public static void main(String[] args) {
		int [] a=new int[3];
		a[0]=10;
		a[1]=12;
		a[2]=13;
		for(int x:a) {
			System.out.println(x);
		}
	}

}
