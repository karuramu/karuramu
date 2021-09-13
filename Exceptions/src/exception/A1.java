package exception;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	// any code is written in try block if it's create exception then try block automatically create a Exception object
	// try create the exception object
	int i=10/0;
}catch(Exception e) 
// catch handle the exception
//which means exception object is created(by try block) that reference given to catch which suppress the exception object still printed "completed" 
// in the below prg
{
	System.out.println(e);
}
System.out.println("completed");
}

}
// in java to handle the Exception we use the try and catch block
//when ever exception happens inside try block ,try  will create  an exception object and then reference of  that object it will give to catch.
//catch will now handle the exception and hence prg will not halt abruptly