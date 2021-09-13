package throwskeyword;

public class C
{

	public static void main(String[] args) 
	{
		A a2=new A();
		try {
			a2.test(); //A.test(); also same but why? we written a1.test();
			}
		catch(Exception e) 
		{
		 System.out.println(e);
		}

	}

}
