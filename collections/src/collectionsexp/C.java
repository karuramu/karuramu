package collectionsexp;
//a.remove(2) key word is use for will remove of that index
//a.removeAll is used for complete remove of arrya
import java.util.ArrayList;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(55);
		a.add(65);
		a.add(75);
		a.remove(2);
		//a.removeAll(a); and a.clear(); is same when we run 
		// a.removeAll(a); is used remove the elements but not memory allocations of elements
		//clear will remove all the elements and memory allocation of elements
		System.out.println(a);
	}
		

}
