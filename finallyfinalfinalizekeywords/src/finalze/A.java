package finalze;
/*When many objects are created and they are not in use then JVM will
 * automatically call java garbage collector to clean up the unused object 
 * but  it is very difficult  to predict when  garbage collector will be called
 */
public class A {
// Programmer call finalize method by command System.g(c);
	// when we call finalize method its is request but when jvm call it is command 
	
	protected void finalize()
	{ System.out.println("from finalize");
		
	}
	// the above method is override from object class
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
            A a1=new A();
            a1=null;
            System.gc();
	}

}
