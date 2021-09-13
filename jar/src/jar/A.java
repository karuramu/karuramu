package jar;

import java.lang.reflect.Method;

/*
 * jar is a collection of .class flies and interfaces 
 * steps to create a jar files
 * right click on project click on Export and click on jar files give the name and save the jar files
 * how to use the jar file after the above step click on another project go to properties
 * Library  and add external jar file click OK
 */
/*reflection 
 * which help us to analyze the members of class developed  by some one else 
 * 
 */



public class A 
{
 public static void main(String[] args) {
	try
	{
	 Class cls= Class.forName("throwskeyword.A");
	 Method[] m=cls.getDeclaredMethods();
	 }catch(Exception e) 
	{
		 System.out.println(e);
	 }
	
}
}
/* the major draw back of reflection is it reduces the security of prg
*
*/