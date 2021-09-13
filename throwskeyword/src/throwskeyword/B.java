package throwskeyword;
/*if we are calling the throws method we must write that  method call statement in try catch block ;
 * it is mandatory  to write in try catch block if its throws exception or not 
 * as shown below 
 * throws key word can throws multiple exceptions	
 */
public class B
{
public static void main(String[] args)
{
	A a1=new A();
	try {
		a1.test(); //A.test();
		}
	catch(Exception e) 
	{
	 System.out.println(e);
	}
	System.out.println("hello");
}
}
