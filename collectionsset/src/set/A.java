package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/*set is always non repetitive data( similar data type will not present in set)
 * sorting is not possible
 *                    set
 *                     |
 *             ----------------
 *            |               |
 *          hashset         Treeset
 *  set- it's is interface
 *  does not maintain any  insertion order
 *  cannot contain  duplicate values
 *  HASHset-uses hash table internally
 *  will contain unique elements  
 *  Dose not maintain  insertion order
 */
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h = new HashSet(30, 0.90f);
		// hash table can create in 3 ways 1- default it has 16 rows when 75% (12 rows--
		//-- of data filled)of rows is completed it will double the rows into 32
		h.add(10);
		h.add(55);
		h.add(45);
		
		System.out.println(h);
		/*
		 * h.size() in syso 
		 * h.remove(10); early we where use remove with index number--
		 *-- but in hashset index nor is no significant so we use h.remove(particular--
		 *-- value) to remove element
		 * 
		 */
	}
	/*
	 * HashSet the above example the default nor rows in table will be 16 and load
	 * ratio will be 0.75f 
	 * HashSet h=new HashSet(32);
	 *  the total nor of rows will be 32 but load ratio by default will be 0.75f 
	 *  HashSet h=new HashSet(30 ,0.90f)
	 * the above example nor of rows is 30 load ratio is 0.90f
	 */
}
//collection should not applied on set 