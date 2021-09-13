package demo;

public class MethodRule{
/* return key word returns the control of the method back to the place from where its called
 *  when you using only return key word make sure that the method is type of void
 *  return key word should be the last statement inside the method
 *  if there are some statement immediately after return key word then those statements never exc and hence we will get  error
 *  error occur is unreachable code 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if return is any thing it should be its receptive data type 
			MethodRule a1=new MethodRule();
		int i=a1.test();// 30 value is return so data type is used is int 
		// when ever method is returning a value the return type can't be void
		System.out.println(i);
			System.out.println("main");
		}

		public int test()  
		{
			System.out.println("from main");
			return 30;
		}	
}
// method call statement can be inside  s.o.p only when the method is returning the value.
// method call statement can't  be inside s.o.p if method return type is void