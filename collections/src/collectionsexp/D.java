package collectionsexp;
// containsAll  will help us to compare the data of two collection A and C  in below prg 
// if it's partially or full  it gives true
import java.util.ArrayList;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(55);
		a.add(65);
		a.add(75);
		ArrayList c=new ArrayList();
c.add(65);
c.add(75);
System.out.println(a.containsAll(c));
	}
	/* to avoid  to store heterogeneous data we can to folowing 
	 * Array<Integer>= new Array<integer>
	 * Array<Float>= new Array<Float>
	 * we can control the Array type
	 * 
	 */

}
