package collectionsexp;
//Collections in java is class  that help us to perform sorting search on collection
//collection is interface
import java.util.ArrayList;
import java.util.Collections;


public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a=new ArrayList();
		a.add(45);
		a.add(55);
		a.add(10);
		Collections.sort(a);
		System.out.println(a);
	}
// collection can be sorted only when homogeneous data store in it or else we will get exception
}
