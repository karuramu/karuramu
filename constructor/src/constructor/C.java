package constructor;

public class C  {
	//constructor should have same name as that of class
	//constructor will exc when the object is created is below example and flow is same as method
		//Constructor
	C(){
		
			System.out.println("same flow as method");

			
		}
			public static void main(String arg[])// if in side the main method nothing is written then it shows
			// error the selection cannot be launched and there are no recent launches
			{
		new C();//creating a object that means creating a constructor
			}
}
		
/*
 * constructor can't called with in the constructor below example 
 *  public class C{
 *  c()
 *  {
 *  C c1=new c();// same type can't be called (we can use the C(100)  )
 *  // we can create multiple Constructor in the same class provide they are differentiated based on nor of argument and type of argument
 *  }
 *  psvm{
 *  C c2=new c();
 *  }
 */



