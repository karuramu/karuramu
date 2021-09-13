package finallykeyword;

import java.io.FileInputStream;
// we use finally very  often to perform close operation
public class A1
{
	static FileInputStream f;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		try {
			 f= new FileInputStream("D://exp.txt"); 
			System.out.println(f.read());
			//f.close();case1 and case2 working fine but case3 fail
		    }catch(Exception e)
		      {
			//f.close();case1 and case2 not working  but case3 pass
			    System.out.println(e);
		      }finally 
		      {
			    // f.close();//cas1 and 3 pass to 2 fail
			try {
				if(f!=null)
				  {
					f.close();
			      }
				}
				catch(Exception e) 
			      {
					System.out.println(e);
				   }
			
			System.out.println("I will always writen");
		
	         }
/* case1 file is found i'm able to read file and closing  the file control will not go to catch 
 * 	case 2 file not found control go to catch which means f.close is not run(execute)finally block will run
 * case3 file found unable to open there fore control go to catch 		
 */
    }
}