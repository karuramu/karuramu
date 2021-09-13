package demo;
/*  pankaj sir 7th video
 * flow of method 
 * it start from main method 
 * then next line 
 * if there is any  other method  it will call the method below prg is test is method 
 * it will exc &print "from main" &it return to main where it called  
 */
public class Methodclosing {
public static void main(String[] args) //start
{
	Methodclosing a1=new Methodclosing();//(1)
	// from line }(in  this prg line 21 it come back to below line 
	a1.test();//(2)
	System.out.println("main");//4
}

public void test() //from 2 it come to this line 
{
	System.out.println("from main");//3
}
}

// run the prg for doubt clarification